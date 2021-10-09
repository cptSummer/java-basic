package com.HT;

public class Circle extends Ellipse {
    public Circle(double a) {
        super(a, a);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(a, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * a;
    }
}
