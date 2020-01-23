package com.company;

public class Rectangle extends Figure {

    /*
    Вычислеение площади прямоугольника по принципу:
    одну сторону прямоугольника умножить на его вторую сторону.
    */
    private double side1;
    private double side2;
    private double side3;
    private double side4;


    public Rectangle(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    void area() {
        double areaResultOfRectangle = side1 * side2;
        System.out.println("Area of rectangle is: " + areaResultOfRectangle + " cm2");
    }
}
