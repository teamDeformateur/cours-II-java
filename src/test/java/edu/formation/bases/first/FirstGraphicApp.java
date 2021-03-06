package edu.formation.bases.first;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Première application graphique en Java.
 * 
 * @author seme edu.formation.bases.first
 */
public class FirstGraphicApp {
  /**
   * Méthode principale.
   * 
   * @param args
   */
  public static void main(String[] args) {
    // Créer une nouvelle fenêtre
    JFrame jf = new JFrame("Titre");
    // Créer les composants graphiques
    JLabel l = new JLabel("Nom:");
    JTextField t = new JTextField(12);
    JButton b = new JButton("OK");
    // Définir une technique de mise en page
    jf.setLayout(new FlowLayout());
    // Ajouter les composants à la fenêtre
    jf.add(l);
    jf.add(t);
    jf.add(b);
    // Définir les dimensions de la fenêtre
    jf.setBounds(10, 10, 400, 400);
    // Afficher la fenêtre
    jf.setVisible(true);
  }
}
