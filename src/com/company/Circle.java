package com.company;

public class Circle extends Figure {

//    /*
//    Вычисление площади круго по принципу:
//    произведение квадрата радиуса умноженного на число пи.
//    */

    final double Pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    void area() {
        double reaResultOfCircle = Pi * (radius * radius);
        System.out.println("Area of circle is: " + reaResultOfCircle + " cm2");
    }

}