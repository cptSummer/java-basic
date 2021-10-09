package com.HT;

public class Rectangle extends Geometry {
    protected double lineA;
    protected double lineB;

    public Rectangle(double lineA, double lineB) {
        this.lineA = lineA;
        this.lineB = lineB;
    }

    @Override
    public double getArea() {
        return lineA * lineB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (lineA + lineB);
    }
}
