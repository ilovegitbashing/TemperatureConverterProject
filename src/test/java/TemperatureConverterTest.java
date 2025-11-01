package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private final TemperatureConverter converter = new TemperatureConverter();

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0), 0.001);
    }
}
