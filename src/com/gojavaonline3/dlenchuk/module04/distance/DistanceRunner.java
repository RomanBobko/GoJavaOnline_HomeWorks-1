package com.gojavaonline3.dlenchuk.module04.distance;

/**
 * Created by Dmitrij Lenchuk on 30.05.2016.
 * Distance Runner
 */
public class DistanceRunner {

    public static void main(String[] args) {
        System.out.println(new Line(0, 0, 3, 4));
        System.out.println(new Line(1, 2, 4, 6));
        System.out.println(new Line(12, 35, 4, 115));

        System.out.println();
        System.out.println(new Line(new Point(0, 0), new Point(3, 4)));
        System.out.println(new Line(new Point(1, 2), new Point(4, 6)));
        System.out.println(new Line(new Point(12, 35), new Point(4, 115)));
    }

}
