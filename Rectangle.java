package com.company;

public class Rectangle extends Figure implements AreaFinder {

    /*
    Вычислеение площади прямоугольника по принципу:
    одну сторону прямоугольника умножить на его вторую сторону.
    */

    int areaResultOfRectangle = side1 * side2;

    public Rectangle(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3, side4);
    }

    @Override
    public void area() {

        System.out.println("Area of rectangle is: " + areaResultOfRectangle + " cm2");
    }
}
