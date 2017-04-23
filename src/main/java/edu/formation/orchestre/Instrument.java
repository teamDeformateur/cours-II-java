/**
 * 
 */
package edu.formation.orchestre;

/**
 * @author Seme
 *
 */
public class Instrument extends Objet
{
    private String nom;
    private Float prix;

    /**
     * Constructeur de la classe Instrument
     * 
     * @param nom
     *            Le nom de l'instrument
     * @param prix
     *            Le prix de l'instrument
     */
    public Instrument(String nom, Float prix)
    {
        this.nom = nom;
        this.prix = prix;
    }

    /**
     * Affiche l'état de l'objet Instrument
     */
    @Override
    public void afficher()
    {
        System.out.println("Nom : " + this.nom + ", prix : " + this.prix + " euros.");
    }

    /**
     * Déprécie l'instrument de 10% C.-à-d. diminue le prix de 10%
     */
    public void depreciation()
    {
        this.prix *= 0.9f;
    }

    /**
     * Retourne le nom de l'instrument
     * 
     * @return String Le nom de l'instrument
     */
    public String getNom()
    {
        return this.nom;
    }

    /**
     * Initialise le nom de l'instrument
     * 
     * @param nom
     *            Le nom de l'instrument
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * Retourne le prix de l'instrument
     * 
     * @return Float Le prix de l'instrument
     */
    public Float getPrix()
    {
        return this.prix;
    }

    /**
     * Initialise le prix de l'instrument
     * 
     * @param prix
     *            Le nouveau prix de l'instrument
     */
    public void setPrix(Float prix)
    {
        this.prix = prix;
    }

}
