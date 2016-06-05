package com.gojavaonline3.dlenchuk.module04.temperature;

import static com.gojavaonline3.dlenchuk.module04.temperature.Thermometer.Units.*;

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

        System.out.println("thermometer2: " + thermometer2.temperature(C));
        System.out.println("thermometer2: " + thermometer2.temperature(F));
        System.out.println("thermometer2: " + thermometer2.temperature(K));
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
    }
}
