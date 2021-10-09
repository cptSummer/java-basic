package com.HT;

public class Rhombus extends Rectangle {
    /**
     * @param lineA - bigger diagonal
     * @param lineB - smaller diagonal
     */
    public Rhombus(double lineA, double lineB) {
        super(lineA, lineB);
    }

    @Override
    public double getArea() {
        return (lineA * lineB) / 2;
    }

    @Override
    public double getPerimeter() {
        double side = Math.sqrt(Math.pow(lineA / 2, 2) + Math.pow(lineB / 2, 2));
        return side * 4;
    }
}
