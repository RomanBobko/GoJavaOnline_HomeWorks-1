package com.gojavaonline3.dlenchuk.module03.flowers;

/**
 * Created by DLenchuk on 26.05.2016.
 *
 */
public abstract class Flower {
    private final Color color;
    private final boolean hasSmell;
    private int height;
    private State state;

    public Flower(Color color, int height, boolean hasSmell, State state) {
        this.color = color;
        this.height = height;
        this.hasSmell = hasSmell;
        this.state = state;
    }

    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public boolean hasSmell() {
        return hasSmell;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ '{' + color + ", " + height + ", " + (hasSmell ? "has smell" : "hasn't smell") + ", " + state + '}';
    }
}
