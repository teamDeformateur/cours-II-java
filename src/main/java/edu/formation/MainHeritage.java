package edu.formation;

import edu.formation.heritage.AbstractEntite;
import edu.formation.heritage.Etudiant;
import edu.formation.heritage.EtudiantStudieux;
import edu.formation.heritage.Personne;
import edu.formation.polymorphisme.Date;
import edu.formation.polymorphisme.DateHistorique;

public class MainHeritage
{

    public static int ajouterUn(int a)
    {
        int newA = a + 1;
        return newA;
    }

    public static void main(String[] args)
    {
        System.out.println(Math.PI);

        String toto = "test";

        Integer b = 1;
        b = ajouterUn(b);

        // 1. on instancie l'objet ent1 de la classe Entier
        Entier ent1 = new Entier();
        ent1.getValeur();
        // 2.
        System.out.println(Entier.getValeurStatique());

        AbstractEntite e = new Personne("Tot", "toto");
        e.afficherInfos();

        Date d0 = new Date(2016, 12, 31);
        d0.afficherDate();

        Date date1;

        String description = "Révolution française";
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

        Date[] dates = new Date[3];
        dates[0] = dpm;
        dates[1] = d0;
        dates[2] = dateHistorique0;

        for (Date date : dates)
        {
            date.afficherDate();
        }

        // Affichage du nombre de personnes
        System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);
        Personne jean = new Personne("Valjean", "Jean");
        jean.afficherInfos();
        // Affichage du nombre de personnes
        System.out.println("Nombre de personnes : " + Personne.nombrePersonnes);

        // Test chgmt String
        Etudiant roger = new Etudiant("Ladalle", "Roger");

        String nom = roger.getNom();

        System.out.println("Avant : " + nom);
        roger.setNom("Faim");
        System.out.println("Après : " + nom);
        System.out.println("Nom " + roger.getNom());

        // Test init. tableau de cours
        String[] desCours = new String[] { "histoire", "philosophie", "mathématiques" };
        Etudiant emma = new Etudiant("Niolia", "Emma", desCours);
        emma.afficherInfos();

        EtudiantStudieux es = new EtudiantStudieux();
        es.afficherInfos();

        boolean pair = true;
        for (int i = 0; i < 500; i++)
        {
            if (pair)
            {
                System.out.print(i + ",");
            }
            pair = !pair;
        }

    }

}
