package com.example;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // Converts Fahrenheit to Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Converts Celsius to Kelvin
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
