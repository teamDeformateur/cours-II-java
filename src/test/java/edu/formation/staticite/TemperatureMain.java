package edu.formation.staticite;

import edu.formation.staticite.TemperatureConverter.TemperatureConverterStatic;

public class TemperatureMain
{

    public static void main(String[] args)
    {

        /* Statique */
        double F, C = 0.0;

        F = Math.max(45, 65);
        C = TemperatureConverterStatic.fahrenheitToCelsius("451");
        System.out.println(C);

        F = TemperatureConverterStatic.celsiusToFahrenheit(new Double(37.2).toString());
        System.out.println(F);
    }

}
