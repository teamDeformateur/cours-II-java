/**
 * 
 */
package edu.formation.orchestre;

/**
 * @author Seme
 *
 */
public class InstrumentACordes extends Instrument
{
    private int nombreDeCordes;
    private String typeDeCordes;

    public InstrumentACordes(String nom, Float prix)
    {
        super(nom, prix);
    }

    public InstrumentACordes(String nom, Float prix, int nombreDeCordes,
            String typeDeCordes)
    {
        super(nom, prix);
        this.nombreDeCordes = nombreDeCordes;
        this.typeDeCordes = typeDeCordes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.formation.orchestre.Instrument#afficher()
     */
    @Override
    public void afficher()
    {
        System.out.println("Nom de l'instrument � cordes : " + this.getNom()
                + ", prix : " + this.getPrix() + " euros, "
                + "type de cordes : " + this.typeDeCordes + ", nb de cordes : "
                + this.nombreDeCordes);
    }

    /**
     * Diminue le prix en fonction d'un taux de d�pr�ciation
     * 
     * @param taux
     */
    public void depreciation(Float taux)
    {
        Float nouveauPrisunic = this.getPrix() * (1 - taux);
        this.setPrix(nouveauPrisunic);
    }
}
