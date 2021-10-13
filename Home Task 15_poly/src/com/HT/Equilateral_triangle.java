package com.HT;

public class Equilateral_triangle extends Triangle {
    public Equilateral_triangle(double lineA) {
        super(lineA, lineA, lineA);
    }

    @Override
    public double getArea() {
        return (Math.pow(lineA, 2) * Math.sqrt(3)) / 4;
    }
}
