package com.HT;

public class Main {

    public static void main(String[] args) {

        Triangle tri = new Triangle(3,5,7);
        Rectangle rec = new Rectangle(2,5);
        System.out.println(tri.getArea());
        System.out.println(rec.getArea());
        Square sq = new Square(3);
        System.out.println(sq.getArea());
    }
}
