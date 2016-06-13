package com.gojavaonline3.dlenchuk.offline.utils;

/**
 * Created by Dmitrij Lenchuk on 11.06.2016.
 *
 */
public class Power {

    public static double power2 (double number) {
        return number * number;
    }

    public static double power3 (double number) {
        return power2(number) * number;
    }

    public static double power4 (double number) {
        return power3(number) * number;
    }
    public static double power5 (double number) {
        return power4(number) * number;
    }

}
