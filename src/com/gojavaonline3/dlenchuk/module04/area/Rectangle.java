package com.gojavaonline3.dlenchuk.module04.area;

import com.gojavaonline3.dlenchuk.module04.distance.Line;
import com.gojavaonline3.dlenchuk.module04.distance.Point;

/**
 * Created by Dmitrij Lenchuk on 02.06.2016.
 * Class Rectangle
 */
public class Rectangle extends TwoDimensionalFigure {
    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final Point pointD;

    private final Line sideA;
    private final Line sideB;
    private final Line sideC;
    private final Line sideD;

    Rectangle(Point pointA, Point pointB, Point pointC, Point pointD) throws FigureExistenceIsImpossibleException {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
        this.sideA = new Line(pointA, pointB);
        this.sideB = new Line(pointB, pointC);
        this.sideC = new Line(pointC, pointD);
        this.sideD = new Line(pointD, pointA);
        checkExists();
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

    public Point getPointD() {
        return pointD;
    }

    @Override
    public double getArea() {
        return this.sideA.length() * this.sideB.length();
    }

    @Override
    public void checkExists() throws FigureExistenceIsImpossibleException {
        if (new Line(pointA, pointC).length() != new Line(pointB, pointD).length()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side AC !=  Side BD'");
        }
        if (sideA.length() != sideC.length()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side AB !=  Side CD'");
        }
        if (sideB.length() != sideD.length()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side BC !=  Side AD'");
        }
        double cosA =
                ((pointB.getX() - pointA.getX()) * (pointD.getX() - pointA.getX()) + (pointB.getY() - pointA.getY()) * (pointD.getY() - pointA.getY()))
                        /
                        (Math.sqrt((pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX()) + (pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY())) *
                                Math.sqrt((pointD.getX() - pointA.getX()) * (pointD.getX() - pointA.getX()) + (pointD.getY() - pointA.getY()) * (pointD.getY() - pointA.getY())));
        if (cosA != 0) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'The angle BAD is not 90 degree");
        }
        double cosC =
                ((pointB.getX() - pointC.getX()) * (pointD.getX() - pointC.getX()) + (pointB.getY() - pointC.getY()) * (pointD.getY() - pointC.getY()))
                        /
                        (Math.sqrt((pointB.getX() - pointC.getX()) * (pointB.getX() - pointC.getX()) + (pointB.getY() - pointC.getY()) * (pointB.getY() - pointC.getY())) *
                                Math.sqrt((pointD.getX() - pointC.getX()) * (pointD.getX() - pointC.getX()) + (pointD.getY() - pointC.getY()) * (pointD.getY() - pointC.getY())));

        if (cosC != 0) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'The angle BCD is not 90 degree");
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "A" + pointA +
                "; B" + pointB +
                "; C" + pointC +
                "; D" + pointD +
                '}';
    }
}
