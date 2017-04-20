/**
 * 
 */
package edu.formation.orchestre;

import java.net.Socket;

/**
 * Classe principale de l'application de gestion des instruments
 * 
 * @author Seme
 *
 */
public class MainInstrument
{
    /**
     * M�thode principale (point d'entr�e)
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        // on rentre le nom et le prix de chaque instrument
        Instrument inst1 = new Instrument("guitare", 1500.0f);
        Instrument inst2 = new Instrument("batterie", 9999.99f);

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
    }
}
