package edu.formation.avance;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MainLog {
  // Define a static logger variable so that it references the
  // Logger instance named "MyApp".
  private static final Logger logger = LogManager.getLogger(MainLog.class);

  public static void main(String[] args) {


    logger.trace("Début du programme");
    logger.trace("Fin du programme");


  }

}
