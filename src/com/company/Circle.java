package com.company;

public class Circle extends Figure implements AreaFinder {

    /*
    Вычисление площади круго по принципу:
    произведение квадрата радиуса умноженного на число пи.
    */

    double radiys = 6;
    final double Pi = 3.14;
    double areaResultOfCircle = Pi * (radiys * radiys);

    @Override
    public void area() {

        System.out.println("Area of circle is: " + areaResultOfCircle + " cm2");
    }
}
