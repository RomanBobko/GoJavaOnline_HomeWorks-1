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

        if (!checkACEqualsBD()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side AC !=  Side BD'");
        }
        if (!checkABEqualsCD()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side AB !=  Side CD'");
        }
        if (!checkBCEqualsAD()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'Side BC !=  Side AD'");
        }
        if (!checkAngleBAD()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'The angle BAD is not 90 degree");
        }
        if (!checkAngleBCD()) {
            throw new FigureExistenceIsImpossibleException("Such rectangle can not be created\nCause: 'The angle BCD is not 90 degree");
        }
    }

    private boolean checkAngleBCD() {
        double cosC =
                ((pointB.getX() - pointC.getX()) * (pointD.getX() - pointC.getX()) + (pointB.getY() - pointC.getY()) * (pointD.getY() - pointC.getY()))
                        /
                        (Math.sqrt((pointB.getX() - pointC.getX()) * (pointB.getX() - pointC.getX()) + (pointB.getY() - pointC.getY()) * (pointB.getY() - pointC.getY())) *
                                Math.sqrt((pointD.getX() - pointC.getX()) * (pointD.getX() - pointC.getX()) + (pointD.getY() - pointC.getY()) * (pointD.getY() - pointC.getY())));
        return cosC == 0;
    }

    private boolean checkAngleBAD() {
        double cosA =
                ((pointB.getX() - pointA.getX()) * (pointD.getX() - pointA.getX()) + (pointB.getY() - pointA.getY()) * (pointD.getY() - pointA.getY()))
                        /
                        (Math.sqrt((pointB.getX() - pointA.getX()) * (pointB.getX() - pointA.getX()) + (pointB.getY() - pointA.getY()) * (pointB.getY() - pointA.getY())) *
                                Math.sqrt((pointD.getX() - pointA.getX()) * (pointD.getX() - pointA.getX()) + (pointD.getY() - pointA.getY()) * (pointD.getY() - pointA.getY())));
        return cosA == 0;
    }

    private boolean checkBCEqualsAD() {
        return sideB.length() == sideD.length();
    }

    private boolean checkACEqualsBD() {
        return new Line(pointA, pointC).length() == new Line(pointB, pointD).length();
    }

    private boolean checkABEqualsCD() {
        return sideA.length() == sideC.length();
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
    public String toString() {
        return "Rectangle{" +
                "A" + pointA +
                "; B" + pointB +
                "; C" + pointC +
                "; D" + pointD +
                '}';
    }
}
