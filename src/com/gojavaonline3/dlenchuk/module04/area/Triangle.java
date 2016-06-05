package com.gojavaonline3.dlenchuk.module04.area;

import com.gojavaonline3.dlenchuk.module04.distance.Line;
import com.gojavaonline3.dlenchuk.module04.distance.Point;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class Triangle
 */
public class Triangle extends TwoDimensionalFigure{
    private final Point pointA;
    private final Point pointB;
    private final Point pointC;

    private final Line sideA;
    private final Line sideB;
    private final Line sideC;

    Triangle(Point pointA, Point pointB, Point pointC) throws IllegalArgumentException {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;

        sideA = new Line(pointB, pointC);
        sideB = new Line(pointA, pointC);
        sideC = new Line(pointA, pointB);
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public Line getSideA() {
        return sideA;
    }

    public Line getSideB() {
        return sideB;
    }

    public Line getSideC() {
        return sideC;
    }

    @Override
    public double getArea() {
        if (!calculated) {
            double a = sideA.length();
            double b = sideB.length();
            double c = sideC.length();
            double p = (a + b + c) / 2;

            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            calculated = true;
        }
        return area;
    }

    @Override
    public void checkExists() throws IllegalArgumentException {
        double a = sideA.length();
        double b = sideB.length();
        double c = sideC.length();

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Such triangle can not be created\nCause: '" + (a <= 0 ? "a <= 0" : b <= 0 ? "b <= 0" : "c <= 0") + "'");
        }
        if (a > b + c || b > a + c || c > a + b) {
            throw new IllegalArgumentException("Such triangle can not be created\nCause: '" + (a > b + c ? "a > b + c" : b > a + c ? "b > a + c" : "c > a + b") + "'");
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "A" + pointA +
                "; B" + pointB +
                "; C" + pointC +
                '}';
    }
}
