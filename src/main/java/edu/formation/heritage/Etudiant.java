package edu.formation.heritage;

import java.util.ArrayList;
import java.util.List;

import edu.formation.Cours;

public class Etudiant extends Personne
{
    /*
     * donn�es de l'objet
     */
    private String nom;
    private String prenom;
    private List<Cours> cours;

    private static final String MOTIVATION = "Au top";

    // Constructeur de la classe
    public Etudiant()
    {
        this.cours = new ArrayList<Cours>();
    }

    public Etudiant(String unNom, String unPrenom)
    {
        // this.nom = new String(nom);
        // this.prenom = new String(prenom);
        this.nom = unNom;
        this.prenom = unPrenom;
        this.cours = new ArrayList<Cours>();
        System.out.println("Objet " + unPrenom + " " + unNom + " instanci�.");
    }

    @Override
    public void afficherInfos()
    {
        System.out.println("Voici donc la personne �tudiante de nom " + this.nom + " et de pr�nom " + this.prenom);
    }

    /*
     * M�thodes qui manipulent les donn�es de l'objet
     */
    public void AjouterCours(Cours cours)
    {
        this.cours.add(cours);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @return the motivation
     */
    public static String getMotivation()
    {
        return Etudiant.MOTIVATION;
    }

    /**
     * 
     */
    public void afficherMotivation()
    {
        System.out.println(MOTIVATION);
    }

}
