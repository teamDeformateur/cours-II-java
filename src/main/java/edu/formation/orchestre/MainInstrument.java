/**
 * 
 */
package edu.formation.orchestre;

/**
 * Classe principale de l'application de gestion des instruments
 * 
 * @author Seme
 *
 */
public class MainInstrument
{
    /**
     * Méthode principale (point d'entrée)
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(IJouable.FOO);
        
        // on rentre le nom et le prix de chaque instrument
        Instrument inst1 = new InstrumentACordes("guitare", 1500.0f);
        Instrument inst2 = new InstrumentAVent("batterie", 9999.99f);

        InstrumentACordes cordes1 = new InstrumentACordes("violon", 59999.0f, 4,
                "nylon");
        InstrumentAVent saxophone = new InstrumentAVent("saxophone", 599.9f,
                TypeInstrument.bois);
        
        saxophone.depreciation(0.5f);

        // on affiche les informations de chaque instrument
        inst1.afficher();
        inst2.afficher();
        // on baisse le prix de la guitare
        inst1.depreciation();
        // on affiche le nouveau prix de la guitare
        System.out.println(
                "Nouveau prix de la guitare : " + inst1.getPrix() + " euros.");
        
        Orchestre o1 = new Orchestre("La fanfaronnerie", TypeOrchestre.harmonique);
        o1.ajouterInstrument(inst1);
        o1.ajouterInstrument(inst2);
        o1.ajouterInstrument(cordes1);
        o1.ajouterInstrument(saxophone);
        
        
        o1.afficherOrchestre();
    }
}
