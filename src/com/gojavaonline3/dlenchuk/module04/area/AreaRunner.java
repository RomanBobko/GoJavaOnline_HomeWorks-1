package com.gojavaonline3.dlenchuk.module04.area;

import com.gojavaonline3.dlenchuk.module04.distance.Point;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class AreaRunner
 */
public class AreaRunner {
    public static void main(String[] args) {

        System.out.println();
        new Circle(new Point(0, 0), 10).draw();
        try {
            new Circle(new Point(0, 0), -10).draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        System.out.println();
        new Triangle(new Point(0, 0), new Point(3, 0), new Point(0, 4)).draw();
        new Triangle(new Point(0, 0), new Point(3, 0), new Point(2, 0)).draw();

        System.out.println();
        new Rectangle(new Point(0, 0), new Point(3, 0), new Point(3, 4), new Point(0, 4)).draw();
        try {
            new Rectangle(new Point(-1, 0), new Point(3, 0), new Point(3, 4), new Point(0, 4)).draw();
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
