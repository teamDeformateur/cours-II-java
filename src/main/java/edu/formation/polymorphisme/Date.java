package edu.formation.polymorphisme;
public class Date {
	protected int annee;
	protected int mois;
	protected int jour;
	
	public Date(int vAnnee, int vMois, int vJour){
		this.annee = vAnnee;
		this.mois = vMois;
		this.jour = vJour;
	}
	
	public void afficherDate(){
		System.out.println("Date : " + this.annee + "-" + this.mois + "-" + this.jour);
	}
}
