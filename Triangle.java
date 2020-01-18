package com.company;

public class Triangle extends Figure implements AreaFinder {

    /*
    Вычисление площади прямоугольного треугольника по принципу:
    длинну одного катета умножить на длинну второго и разделить на два.
    */

    int areaResultOfTriangle = (side1 * side2) / 2;

    public Triangle(int side1, int side2, int side3) {
        super(side1, side2, side3);
    }

    @Override
    public void area() {

        System.out.println("Area of triangle is: " + areaResultOfTriangle + " cm2");
    }
}



