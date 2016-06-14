package com.gojavaonline3.dlenchuk.module04.temperature;

/**
 * Created by Dmitrij Lenchuk on 07.06.2016.
 * Exception OutOfBoundsThermometerException
 */
public class OutOfBoundsThermometerException extends Exception{

    private final double temperature;

    public OutOfBoundsThermometerException(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

}
