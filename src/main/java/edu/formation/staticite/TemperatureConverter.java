package edu.formation.staticite;

/**
 * Classe qui englobe la classe statique Temperatureconverter
 * 
 * @author Seme
 */
public class TemperatureConverter
{
    /**
     * propose les services suivants : - conversion de temp�rature de celsius
     * vers fahrenheit - conversion de temp�rature de fahrenheit vers celsius
     * 
     * @author Seme
     */
    public static class TemperatureConverterStatic
    {
        /**
         * Convertit une temp�rature en degr�s Celsius en degr�s Fahrenheit
         * 
         * @param temperatureCelsius
         *            La temp�rature en degr�s Celsius
         * @return La temperature en degr�s fahrenheit
         */
        public static double celsiusToFahrenheit(String temperatureCelsius)
        {
            // Conversion en double (grand float)
            double celsius = Double.parseDouble(temperatureCelsius);

            // conversion celsius en fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;

            // on retourne la temp�rature en fahrenheit
            return fahrenheit;
        }

        /**
         * Convertit une temp�rature en degr�s Fahrenheit en degr�s Celsius
         * 
         * @param temperatureFahrenheit
         *            La temp�rature en fahrenheit
         * @return La temp�rature en celsius
         */
        public static double fahrenheitToCelsius(String temperatureFahrenheit)
        {
            // Conversion en double (grand float)
            double fahrenheit = Double.parseDouble(temperatureFahrenheit);

            // conversion celsius en fahrenheit
            double celsius = (fahrenheit - 32) * 5 / 9;

            // on retourne la temp�rature en fahrenheit
            return celsius;
        }
    }
}
