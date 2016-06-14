package com.gojavaonline3.dlenchuk.module04.temperature;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Created by Dmitrij Lenchuk on 14.06.2016.
 * Class Temperature
 */
public class Temperature implements Comparable {

    public static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;

    public static enum Units {
        KELVIN,
        CELSIUS,
        FAHRENHEIT;

        public static Units unit(char unit) {
            return Arrays.asList(Units.values())
                    .stream()
                    .filter(u -> u.name().charAt(0) == unit)
                    .findFirst()
                    .get();
        }

    }

    private double kelvinT;

    Temperature() {
        setKelvinT(0);
    }

    Temperature(double kelvinT) {
        setKelvinT(kelvinT);
    }

    Temperature(String temperature) throws IllegalUnitOfTemperatureException, OutOfBoundsThermometerException {
        setKelvinT(parseTemperature(temperature));
    }

    public double getKelvinT() {
        return kelvinT;
    }

    public void setKelvinT(double kelvinT) {
        this.kelvinT = kelvinT;
    }

    public Temperature delta(String delta) throws IllegalUnitOfTemperatureException, OutOfBoundsThermometerException {
        delta = delta.trim();
        Units unit = parseUnits(delta);
        double value = Double.valueOf(delta.substring(0, delta.length() - 1));

        switch (unit) {
            case KELVIN:
                return new Temperature(kelvinT + value);
            case CELSIUS:
                return new Temperature(kelvinT + value);
            case FAHRENHEIT:
                return new Temperature(fahrenheitToKelvin(kelvinToFahrenheit(kelvinT) + value));
        }

        throw new IllegalUnitOfTemperatureException(String.valueOf(unit));
    }

    private double parseTemperature(String temperature) throws IllegalUnitOfTemperatureException {
        temperature = temperature.trim();

        Units unit = parseUnits(temperature);
        double value = Double.valueOf(temperature.substring(0, temperature.length() - 1));

        switch (unit) {
            case KELVIN:
                return value;
            case CELSIUS:
                return celsiusToKelvin(value);
            case FAHRENHEIT:
                return fahrenheitToKelvin(value);
        }

        throw new IllegalUnitOfTemperatureException(String.valueOf(unit));
    }

    private Units parseUnits(String temperature) throws IllegalUnitOfTemperatureException {
        temperature = temperature.trim();
        Units unit;

        try {
            unit = Units.unit(temperature.charAt(temperature.length() - 1));
        } catch (IllegalArgumentException | NoSuchElementException e) {
            throw new IllegalUnitOfTemperatureException(temperature);
        }

        return unit;
    }

    private double fahrenheitToCelsius(double tFahrenheit) {
        return 5 * (tFahrenheit - 32) / 9;
    }

    private double celsiusToFahrenheit(double tCelsius) {
        return 9 * tCelsius / 5 + 32;
    }

    private double kelvinToFahrenheit(double kelvinT) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvinT));
    }

    private double fahrenheitToKelvin(double tFahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(tFahrenheit));
    }

    private double kelvinToCelsius(double kelvinT) {
        return kelvinT + ABSOLUTE_ZERO_IN_CELSIUS;
    }

    private double celsiusToKelvin(double celsiusT) {
        return celsiusT - ABSOLUTE_ZERO_IN_CELSIUS;
    }

    public double fahrenheit() {
        return kelvinToFahrenheit(getKelvinT());
    }

    public double celsius() {
        return kelvinToCelsius(getKelvinT());
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null) return (int) -this.kelvinT;
        if (this == obj) return 0;
        if (!(obj instanceof Temperature))
            throw new IllegalArgumentException("Invalid class of object '" + obj.getClass().getSimpleName() + '\'');

        Temperature that = (Temperature) obj;

        return (int) (this.kelvinT - that.kelvinT);
    }
}
