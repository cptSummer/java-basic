package com.HT;

public class Main {

    public static void main(String[] args) {

        Triangle tri = new Triangle(3, 5, 7);
        Rectangle rec = new Rectangle(2, 5);
        System.out.println("Triangle area = " + tri.getArea());
        System.out.println("Rectangle area = " + rec.getArea());
        Square sq = new Square(3);
        System.out.println("Square area =" + sq.getArea());
        Isosceles_triangle iso = new Isosceles_triangle(3, 10);
        System.out.println("Isosceles triangle area = " + iso.getPerimeter());
        Equilateral_triangle equ = new Equilateral_triangle(5);
        System.out.println("Equilateral triangle area = " + equ.getArea());
        Ellipse ellipse = new Ellipse(4, 6);
        System.out.println("Ellipse area = " + ellipse.getArea());
    }
}
