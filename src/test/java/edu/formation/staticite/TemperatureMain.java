package edu.formation.staticite;

import edu.formation.staticite.TemperatureConverter.TemperatureConverterStatic;

public class TemperatureMain
{

    public static void main(String[] args)
    {

        /* Statique */
        double f, c = 0.0;

        f = Math.max(45, 65);
        c = TemperatureConverterStatic.fahrenheitToCelsius("451");
        System.out.println(c);

        f = TemperatureConverterStatic.celsiusToFahrenheit(new Double(37.2).toString());
        System.out.println(f);
    }

}
