package com.company;

public class Circle extends Figure implements AreaFinder {

    /*
    Вычисление площади круго по принципу:
    произведение квадрата радиуса умноженного на число пи.
    */

    double areaResultOfCircle = Pi * (radiys * radiys);

    public Circle(double radiys) {
        super(radiys);
    }

    @Override
    public void area() {

        System.out.println("Area of circle is: " + areaResultOfCircle + " cm2");
    }
}
