package com.gojavaonline3.dlenchuk.module04.temperature;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class Thermometer
 */
public class Thermometer {

    private double celsiusT = 0;
    private double fahrenheitT = celsiusToFahrenheit(0);

    public double getFahrenheitT() {
        return fahrenheitT;
    }

    public void setFahrenheitT(double fahrenheitT) {
        this.fahrenheitT = fahrenheitT;
        this.celsiusT = fahrenheitToCelsius(fahrenheitT);
    }

    public double getCelsiusT() {
        return celsiusT;
    }

    public void setCelsiusT(double celsiusT) {
        this.celsiusT = celsiusT;
        this.fahrenheitT = celsiusToFahrenheit(celsiusT);

    }

    private double fahrenheitToCelsius(double tFahrenheit) {
        return 5 * (tFahrenheit - 32) / 9;
    }

    private double celsiusToFahrenheit(double tCelsius) {
        return 9 * tCelsius / 5 + 32;
    }

    @Override
    public String toString() {
        return "Thermometer{" +
                "celsiusT = " + String.format("%.2f", celsiusT) +
                "; fahrenheitT = " + String.format("%.2f", fahrenheitT) +
                '}';
    }
}
