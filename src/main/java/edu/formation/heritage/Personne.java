package edu.formation.heritage;

public class Personne extends Entite {
	protected String nom;
	protected String prenom;
	
	public Personne(){
	    
	}

	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // nombre de personnes dans tout le programme
	public static int nombrePersonnes = 0;

	public Personne(String unNom, String unPrenom) {
		this.nom = unNom;
		this.prenom = unPrenom;
		// On ajoute une personne � chaque construction
		Personne.nombrePersonnes++;
	}

	@Override
	public void afficherInfos() {
		System.out.println("Voici donc la personne de nom " + this.nom + " et de pr�nom " + this.prenom);
	}
	
	public void methodeSpecifique(){
	    System.err.println("Foo");
	}

}
