package edu.formation.heritage;

public class Test
{

    public static void main(String[] args)
    {
        Entite e1 = new Personne("G.R.R.", "Martin");
        Entite e2 = new Entreprise("50978945600019");

        // polymorphisme !!!!!!!!
        e1.afficherInfos();
        e2.afficherInfos();

        ((Personne) e1).methodeSpecifique();

        Personne e4 = new Personne("Ladalle", "Roger");
        Entreprise e3 = new Entreprise("55599977700001");
        e3.ajouterBranche("DG");
        e3.ajouterBranche("R&D");
        e3.ajouterEmploye(e4);

        e3.afficherInfos();

        // System.out.println(Personne.nombrePersonnes);

    }
}
