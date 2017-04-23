package edu.formation.orchestre;

public class Orchestre
{
    private String nom;
    private Instrument[] instruments;
    private TypeOrchestre typeOrchestre;

    private static int nbInstruments = 0;

    /**
     * @param typeOrchestre
     */
    public Orchestre(String nom, TypeOrchestre typeOrchestre)
    {
        this.nom = nom;
        this.typeOrchestre = typeOrchestre;
        this.instruments = new Instrument[200];
    }

    // méthode permettant l'ajout d'un instrument
    public void ajouterInstrument(Instrument instrument)
    {
        this.instruments[nbInstruments] = instrument;
        nbInstruments++;
    }

    // méthode permettant d'afficher l'orchestre
    public void afficherOrchestre()
    {
        System.out.println("L'orchestre " + this.typeOrchestre + " " + this.nom
                + " est formé des instruments :");
        for (int i = 0; i < nbInstruments; i++)
        {
            System.out.print("    - ");
            this.instruments[i].afficher();
        }
    }
}
