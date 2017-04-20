/**
 * 
 */
package edu.formation.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.formation.heritage.Etudiant;

/**
 * @author Seme
 * @param <T>
 *
 */
public class DBRecovery implements IDataRecovery<Etudiant>
{
    private Connection conn;

    public DBRecovery()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/formateur", "user", "");
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.interfaces.IDataRecovery#findAll()
     */
    @Override
    public List<Etudiant> findAll()
    {
        // La liste des étudiants que l'on va retourner
        List<Etudiant> listeEtudiant = new ArrayList<Etudiant>();
        // Connexion à la BDD
        /*
         * ------------------------- + Connexion à la BDD +
         * -------------------------
         */
        try
        {
            // 3. Création de la requête (statement)
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM eleve");
            // 4. On exécute la requête
            ResultSet tuple = ps.executeQuery();
            // 5. Parcours de l'ensemble des résultats (ResultSet)
            while (tuple.next())
            {
                // je récupère les valeurs des colonnes qui correspondent
                // aux valeurs des attributs de l'objet
                String nom = tuple.getString("nom");
                String prenom = tuple.getString("prenom");
                // Création d'un objet Elève
                Etudiant eleve = new Etudiant(nom, prenom);

                // on est content ! ^^ :D =) :) (rofl)

                // je l'ajoute à la liste des élèves
                listeEtudiant.add(eleve);
            } // fin de la boucle de parcours de l'ensemble des résultats
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // we return the student list : alleluia
        return listeEtudiant;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.interfaces.IDataRecovery#findById(java.lang.Long)
     */
    @Override
    public Etudiant findById(Long id)
    {
        Etudiant etudiant = null;

        try
        {

            PreparedStatement ps = conn.prepareStatement("select * from etudiant where id=?");
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                // Construction de l'objet
                etudiant = new Etudiant(rs.getString("NOM"), rs.getString("PRENOM"));
            }
        }
        catch (SQLException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return etudiant;
    }

}
