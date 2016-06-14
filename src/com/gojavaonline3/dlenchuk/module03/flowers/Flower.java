package com.gojavaonline3.dlenchuk.module03.flowers;

/**
 * Created by DLenchuk on 26.05.2016.
 *
 */
public abstract class Flower {

    private final Color color;
    private final boolean smelled;
    private int height;
    private State state;

    Flower(Color color, int height, boolean smelled, State state) {
        this.color = color;
        this.height = height;
        this.smelled = smelled;
        this.state = state;
    }

    public Color getColor() {
        return color;
    }

    public boolean isSmelled() {
        return smelled;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ '{' + color + ", " + height + ", " + (smelled ? "has smell" : "hasn't smell") + ", " + state + '}';
    }

}
