package com.company;

public class Rectangle extends Figure implements AreaFinder {

    /*
    Вычислеение площади прямоугольника по принципу:
    одну сторону прямоугольника умножить на его вторую сторону.
    */

    int side1 = 10;
    int side2 = 5;
    int side3;
    int side4;
    int areaResultOfRectangle = side1 * side2;

    @Override
    public void area() {

        System.out.println("Area of rectangle is: " + areaResultOfRectangle + " cm2");
    }
}
