package edu.formation.heritage;

public abstract class Entite {
	protected Boolean existe;

    public Entite()
    {
        this.existe = true;
    }

//    public void afficherInfos(){
//        System.out.println("Entite");
//        // d'autres instructions ....
//    }
    
    public abstract void afficherInfos();

    public void tuerEntite()
    {
        this.existe = false;
    }

}
