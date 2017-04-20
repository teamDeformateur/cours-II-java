package edu.formation.heritage;

import java.util.ArrayList;

public class Entreprise extends Entite
{
    // Clase interne, ne peut être instanciée ailleurs qu'ici
    private class Branche
    {
        private String nom;

        public Branche(String unNom)
        {
            this.nom = unNom;
        }

    }

    private String numeroSiret;
    // agrégation
    private ArrayList<Personne> employes;
    // composition
    private ArrayList<Branche> branches;

    // Constructeur
    public Entreprise(String unNumeroSiret)
    {
        // super(); pas besoin car appel implicite
        this.numeroSiret = unNumeroSiret;
        this.employes = new ArrayList<Personne>();
        this.branches = new ArrayList<Branche>();
    }

    // Méthode qui crée et qui ajoute une branche à l'entreprise
    public void AjouterBranche(String nom)
    {
        // C'est l'entreprise qui se charge de créer ses branches
        this.branches.add(new Branche(nom));
    }

    public void AjouterEmploye(Personne personne)
    {
        // Ici, pas de création, l'objet existe déjà
        this.employes.add(personne);
    }

    /*
     * Méthode qui affiche la liste des employés
     */
    public void afficherEmployes()
    {
        System.out.println("Voici la liste des employés de l'entreprise " + this.numeroSiret + " : \n");
        if (!this.employes.isEmpty())
        {
            for (Personne employe : this.employes)
            {
                employe.afficherInfos();
            }
        }
    }

    @Override
    public void afficherInfos()
    {
        System.out.print("Je suis une entreprise de numero SIRET : " + this.numeroSiret);

        if (!this.branches.isEmpty())
        {
            System.out.print(" composée des branches : ");
            for (Branche b : this.branches)
            {
                System.out.print(b.nom + "/");
            }
        }
        if (!this.employes.isEmpty())
        {
            System.out.print(" et des employés : ");
            for (Personne p : this.employes)
            {
                System.out.print(p.getNom() + " " + p.getPrenom() + "/");
            }
        }

        System.out.println();
    }
}
