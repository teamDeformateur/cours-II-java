package edu.formation;

import java.util.List;

import edu.formation.heritage.Entite;
import edu.formation.heritage.Etudiant;
import edu.formation.heritage.EtudiantStudieux;
import edu.formation.heritage.Personne;
import edu.formation.polymorphisme.Date;
import edu.formation.polymorphisme.DateHistorique;

public class Main
{

    public static int ajouterUn(int a)
    {
        a += 1;
        return a;
    }

    public static void main(String[] args)
    {
        String toto = "test";

        Integer b = 1;
        b = ajouterUn(b);

        // 1. on instancie l'objet ent1 de la classe Entier
        Entier ent1 = new Entier();
        // 2.
        System.out.println(Entier.getValeurStatique());

        Entite e = new Personne("Tot", "toto");

        Date d0 = new Date(2016, 12, 31);
        d0.afficherDate();

        Date date1;

        String description = new String("Révolution française");
        DateHistorique dateHistorique0 = new DateHistorique(1789, 7, 14, description);
        dateHistorique0.methodePropreADateHistorique();

        dateHistorique0.afficherDate();

        DateHistorique dh1;

        // je peux affecter une référence DateHistorique à une Date
        // tu peux référencer une DateHistorique avec une référence de Date
        date1 = dateHistorique0;
        // ERREUR !
        // je ne peux affecter une référence de Date à une DateHistorique
        // dh1 = d0;

        /*
         * Polymorphisme
         */
        Date dpm = new DateHistorique(1515, 1, 1, "Marignan");
        ((DateHistorique) dpm).methodePropreADateHistorique();

        dpm.afficherDate();

        Date[] dates = new Date[365];
        dates[0] = dpm;
        dates[1] = d0;
        dates[2] = dateHistorique0;

        for (int i = 0; i < dates.length; i++)
        {
            dates[i].afficherDate();
        }

        // Affichage du nombre de personnes
        System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);
        Personne jean = new Personne("Valjean", "Jean");
        // Affichage du nombre de personnes
        System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);

        // Test chgmt String
        Etudiant roger = new Etudiant("Ladalle", "Roger");

        String nom = roger.getNom();

        System.out.println("Avant : " + nom);
        roger.setNom("Faim");
        System.out.println("Après : " + nom);
        System.out.println("Nom " + roger.getNom());

        EtudiantStudieux es = new EtudiantStudieux();

    }

}
