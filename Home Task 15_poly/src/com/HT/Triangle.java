package com.HT;

public class Triangle extends Geometry {
    protected double lineA;
    protected double lineB;
    protected double lineC;

    public Triangle(double lineA, double lineB, double lineC) {
        this.lineA = lineA;
        this.lineB = lineB;
        this.lineC = lineC;
    }

    @Override
    public double getArea() {
        double p = (lineA + lineB + lineC) / 2;
        return Math.sqrt(p * (p - lineA) * (p - lineB) * (p - lineC));
    }

    @Override
    public double getPerimeter() {
        return lineA + lineB + lineC;
    }
}
