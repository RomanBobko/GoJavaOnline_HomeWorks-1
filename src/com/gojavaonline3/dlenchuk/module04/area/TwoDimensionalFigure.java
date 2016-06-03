package com.gojavaonline3.dlenchuk.module04.area;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Abstract Class Figure
 */
public abstract class TwoDimensionalFigure {

    protected double area;
    protected boolean isCalculated = false; //Дима, у нас в спор в группе был, стоит ли делать такую проверку?..

    public abstract double getArea();

    public abstract void checkExists() throws IllegalArgumentException;

    public void draw() {
        System.out.println("Draw " + this.toString() + ". Area is " + getArea());
    }
}
