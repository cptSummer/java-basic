package com.HT;

public class Isosceles_triangle extends Triangle {
    /**
     * @param lineA - two sides
     * @param lineB - base or height
     */
    public Isosceles_triangle(double lineA, double lineB) {
        super(lineA, lineA, lineB);
    }

    @Override
    public double getArea() {
        return (1 / 2) * lineA * lineB;
    }
}
