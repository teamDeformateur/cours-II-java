/**
 * 
 */
package edu.formation.universite;

/**
 * @author Seme
 *
 */
public class Etudiant
{
    /**
     * 
     */
    private String nom;
    /**
     * 
     */
    private String prenom;

    /**
     * 
     * @param nom
     * @param prenom
     */
    public Etudiant(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
        System.out.println("Objet " + this.prenom + " " + this.nom + " instancié (on est content).");
    }

    /**
     * 
     * @return
     */
    public String getNom()
    {
        return this.nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

}
