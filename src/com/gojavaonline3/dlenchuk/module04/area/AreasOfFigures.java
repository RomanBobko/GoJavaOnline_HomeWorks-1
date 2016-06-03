package com.gojavaonline3.dlenchuk.module04.area;

/**
 * Created by DLenchuk on 27.05.2016.
 *
 */
public class AreasOfFigures {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        double gamma = Math.random() * Math.PI;
        int h = (int) (Math.random() * 100);
        int r = (int) (Math.random() * 100);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("gamma = " + gamma);
        System.out.println("h = " + h);
        System.out.println("r = " + r);
        try {
            System.out.println("areaOfTriangle(" + a + ", " + b + ", " + c + ") = " + areaOfTriangle(a, b, c));
        } catch (IllegalArgumentException e) {
            System.out.println("triangle(" + a + ", " + b + ", " + c + ") can't exists, because " + e.getMessage());
        }
        System.out.println("areaOfTriangle(" + a + ", " + b + ", " + gamma + ") = " + areaOfTriangle(a, b, gamma));
        System.out.println("areaOfTriangle(" + a + ", " + h + ") = " + areaOfTriangle(a, h));
        System.out.println("areaOfRectangle(" + a + ", " + b + ") = " + areaOfRectangle(a, b));
        System.out.println("areaOfCircle(" + r + ") = " + areaOfCircle(r));
    }

    /**
     * Returns area of a triangle by three sides
     *
     * @param a length of side a.
     * @param b length of side b.
     * @param c length of side c.
     * @return an area of a triangle.
     */
    public static double areaOfTriangle(int a, int b, int c) throws IllegalArgumentException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException(a <= 0 ? "a <= 0" : b <= 0 ? "b <= 0" : "c <= 0");
        }
        if (a >= b + c || b >= a + c || c >= a + b) {
            throw new IllegalArgumentException(a >= b + c ? "a >= b + c" : b >= a + c ? "b >= a + c" : "c >= a + b");
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * Returns area of a triangle by two sides and
     * the angle between the sides
     *
     * @param a     length of side a.
     * @param b     length of side b.
     * @param gamma angle between a & b in the radians.
     * @return an area of a triangle.
     */
    public static double areaOfTriangle(int a, int b, double gamma) {
        return a * b * Math.sin(gamma) / 2;
    }

    /**
     * Returns area of a triangle by a side and the height
     *
     * @param a length of side a.
     * @param h height on side a.
     * @return an area of a triangle.
     */
    public static float areaOfTriangle(int a, int h) {
        return a * h / 2;
    }

    /**
     * Returns area of a rectangle
     *
     * @param a length of side a.
     * @param b length of side b.
     * @return an area of a triangle.
     */
    public static long areaOfRectangle(int a, int b) {
        return a * b;
    }

    /**
     * Returns area of a circle
     *
     * @param r radius of the circle.
     * @return an area of a circle.
     */
    public static double areaOfCircle(int r) {
        return Math.PI * r * r;
    }

}
