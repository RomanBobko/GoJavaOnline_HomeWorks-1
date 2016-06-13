package com.gojavaonline3.dlenchuk.offline.utils;

import java.util.Arrays;

/**
 * Created by Dmitrij Lenchuk on 12.06.2016.
 *
 */
public class Calculator {

    public static void main(String[] args) {
        String expression = "10 + 12 * (15 + 12*(3 + 4))";
        expression = expression.replace(" ", "");
        System.out.println(expression);
        System.out.println(Arrays.toString(expression.split("[\\(|\\)]")));
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static double calculate(String expression) {

        return 0;
    }

}
