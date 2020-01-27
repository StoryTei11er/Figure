package com.company;

public class Triangle extends Figure {

    /*
    Вычисление площади прямоугольного треугольника по принципу:
    длинну одного катета умножить на длинну второго и разделить на два.
    */

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    void area() {
        double areaResultOfTriangle = (side1 * side2) / 2;
        System.out.println("Area of triangle is: " + areaResultOfTriangle + " cm2");
    }
}
