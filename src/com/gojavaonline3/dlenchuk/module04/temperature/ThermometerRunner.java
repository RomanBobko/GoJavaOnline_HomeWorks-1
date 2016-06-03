package com.gojavaonline3.dlenchuk.module04.temperature;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class ThermometerRunner
 */
public class ThermometerRunner {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        System.out.print("Default values:\n    ");
        System.out.println(thermometer);
        thermometer.setFahrenheitT(-40);

        System.out.println();
        System.out.print("Set Fahrenheit:\n    ");
        System.out.println(thermometer);
        thermometer.setFahrenheitT(0);
        System.out.print("    ");
        System.out.println(thermometer);
        thermometer.setFahrenheitT(40);
        System.out.print("    ");
        System.out.println(thermometer);

        System.out.println();
        thermometer.setCelsiusT(-273);
        System.out.print("Set Celsius:\n    ");
        System.out.println(thermometer);
        thermometer.setCelsiusT(-40);
        System.out.print("    ");
        System.out.println(thermometer);
        thermometer.setCelsiusT(0);
        System.out.print("    ");
        System.out.println(thermometer);
        thermometer.setCelsiusT(10);
        System.out.print("    ");
        System.out.println(thermometer);
        thermometer.setCelsiusT(40);
        System.out.print("    ");
        System.out.println(thermometer);
    }
}
