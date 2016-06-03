package com.gojavaonline3.dlenchuk.module04.temperature;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class ThermometerRunner
 */
public class ThermometerRunner {
    public static void main(String[] args) {

        Thermometer thermometer1 = new Thermometer();
        System.out.println("thermometer1: " + thermometer1);

        Thermometer thermometer2 = new Thermometer("240K");
        System.out.println("thermometer2: " + thermometer2);

        System.out.println("thermometer2: " + thermometer2.temperature(Thermometer.Units.C));
        System.out.println("thermometer2: " + thermometer2.temperature(Thermometer.Units.F));
        System.out.println("thermometer2: " + thermometer2.temperature(Thermometer.Units.K));
        thermometer2.delta("20K");
        System.out.println("thermometer2 +20K: " + thermometer2);
        thermometer2.delta("10C");
        System.out.println("thermometer2 +10C: " + thermometer2);
        try {
            thermometer2.delta("100C");
            System.out.println("thermometer2 +100C: " + thermometer2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        thermometer2.delta("-5K");
        System.out.println("thermometer2 -5K: " + thermometer2);
        thermometer2.delta("-7F");
        System.out.println("thermometer2 -7F: " + thermometer2);

        System.out.println("Compare: " + thermometer2.compareTo(thermometer1));
        System.out.println("Compare: " + thermometer2.compareTo(null));


//        Thermometer thermometer = new Thermometer();
//        System.out.print("Default values:\n    ");
//        System.out.println(thermometer);
//        thermometer.setFahrenheitT(-40);
//
//        System.out.println();
//        System.out.print("Set Fahrenheit:\n    ");
//        System.out.println(thermometer);
//        thermometer.setFahrenheitT(0);
//        System.out.print("    ");
//        System.out.println(thermometer);
//        thermometer.setFahrenheitT(40);
//        System.out.print("    ");
//        System.out.println(thermometer);
//
//        System.out.println();
//        thermometer.setCelsiusT(-273);
//        System.out.print("Set Celsius:\n    ");
//        System.out.println(thermometer);
//        thermometer.setCelsiusT(-40);
//        System.out.print("    ");
//        System.out.println(thermometer);
//        thermometer.setCelsiusT(0);
//        System.out.print("    ");
//        System.out.println(thermometer);
//        thermometer.setCelsiusT(10);
//        System.out.print("    ");
//        System.out.println(thermometer);
//        thermometer.setCelsiusT(40);
//        System.out.print("    ");
//        System.out.println(thermometer);
    }
}
