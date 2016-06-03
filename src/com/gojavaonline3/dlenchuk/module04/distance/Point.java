package com.gojavaonline3.dlenchuk.module04.distance;

/**
 * Created by Dmitrij Lenchyk on 02.06.2016.
 * Class Point
 */
public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
