package com.company;

public class Triangle extends Figure implements GetArea {

    /*
    Вычисление площади прямоугольного треугольника по принципу:
    длинну одного катета умножить на длинну второго и разделить на два.
    */

    int side1 = 10;
    int side2 = 5;
    int areaResultOfTriangle = (side1 * side2) / 2;

    @Override
    public void area() {

        System.out.println("Area of triangle is: " + areaResultOfTriangle + " cm2");
    }
}



