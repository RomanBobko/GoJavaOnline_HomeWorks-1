package com.gojavaonline3.dlenchuk.module04.area;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Abstract Class Figure
 */
public abstract class TwoDimensionalFigure {

    protected double area;
    protected boolean calculated = false;

    public abstract double getArea();

    public void draw() {
        System.out.println("Draw " + this.toString() + ". Area is " + getArea());
    }

}
