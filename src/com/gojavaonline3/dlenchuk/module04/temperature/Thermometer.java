package com.gojavaonline3.dlenchuk.module04.temperature;

import java.util.Arrays;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class Thermometer
 */
public class Thermometer implements Comparable {

    public static final double ABSOLUTE_ZERO = -273.15;

    public static enum Units {
        K,
        C,
        F
    }

    public static enum TemperatureRange {
        MIN(-40 - ABSOLUTE_ZERO),
        MAX(40 - ABSOLUTE_ZERO);

        private double value;

        public double getValue() {
            return value;
        }

        TemperatureRange(double value) {
            this.value = value;
        }
    }

    private double kelvinT;

    Thermometer() {
        setKelvinT(TemperatureRange.MIN.getValue());
    }

    Thermometer(String temperature) {
        setKelvinT(parseTemperature(temperature));
    }

    public void setKelvinT(double kelvinT) {
        checkRange(kelvinT);
        this.kelvinT = kelvinT;
    }

    public double fahrenheit() {
        return kelvinToFahrenheit(kelvinT);
    }

    public double celsius() {
        return kelvinToCelsius(kelvinT);
    }

    public String temperature(Units unit) throws IllegalArgumentException{
        switch (unit) {
            case K:
                return String.format("%.2f", kelvinT) + '\u00B0' + unit.name();
            case C:
                return String.format("%.2f", kelvinToCelsius(kelvinT)) + '\u00B0' + unit.name();
            case F:
                return String.format("%.2f", kelvinToFahrenheit(kelvinT)) + '\u00B0' + unit.name();
        }
        throw new IllegalArgumentException("The unit '" + unit.name() + "' is not supported");
    }

    public void delta(String delta) {

        delta = delta.trim();
        char unit = parseUnits(delta);
        double value = Double.valueOf(delta.substring(0, delta.length() - 1));
        switch (Units.valueOf(String.valueOf(unit))) {
            case K:
                setKelvinT(kelvinT + value);
                return;
            case C:
                setKelvinT(kelvinT + value);
                return;
            case F:
                setKelvinT(fahrenheitToKelvin(kelvinToFahrenheit(kelvinT) + value));
                return;
        }
        throw new IllegalArgumentException("The unit '" + unit + "' is not supported");
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
        return kelvinT + ABSOLUTE_ZERO;
    }

    private double celsiusToKelvin(double celsiusT) {
        return celsiusT - ABSOLUTE_ZERO;
    }

    private double parseTemperature(String temperature) throws IllegalArgumentException {
        temperature = temperature.trim();
        char unit = parseUnits(temperature);
        double value = Double.valueOf(temperature.substring(0, temperature.length() - 1));
        switch (Units.valueOf(String.valueOf(unit))) {
            case K:
                return value;
            case C:
                return celsiusToKelvin(value);
            case F:
                return fahrenheitToKelvin(value);
        }
        throw new IllegalArgumentException("The unit '" + unit + "' is not supported");
    }

    private char parseUnits(String temperature) throws IllegalArgumentException {
        temperature = temperature.trim();
        char unit = new StringBuffer(temperature).charAt(temperature.length() - 1);
        checkUnit(unit);
        return unit;
    }

    private void checkRange(double kelvinT) throws IllegalArgumentException {
        if (kelvinT < TemperatureRange.MIN.getValue() || kelvinT > TemperatureRange.MAX.getValue()) {
            throw new IllegalArgumentException("Out of Temperature Range");
        }
    }

    private void checkUnit(char unit) throws IllegalArgumentException {
        int index = Arrays.binarySearch(Units.values(), Units.valueOf(String.valueOf(unit)));
        if (index < 0) {
            throw new IllegalArgumentException("The unit '" + unit + "' is not supported");
        }
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "celsiusT = " + String.format("%.2f", celsius()) +
                "; fahrenheitT = " + String.format("%.2f", fahrenheit()) +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null) return (int)-this.kelvinT;
        if (this == obj) return 0;
        if (!(obj instanceof Thermometer))
            throw new IllegalArgumentException("Invalid class of object '" + obj.getClass().getSimpleName() + '\'');

        Thermometer that = (Thermometer) obj;

        return (int)(this.kelvinT - that.kelvinT);
    }
}
