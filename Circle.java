package com.company;

public class Circle extends Figure  {

//    /*
//    Вычисление площади круго по принципу:
//    произведение квадрата радиуса умноженного на число пи.
//    */

    final double Pi = 3.14;
    double radius = 6;
    double areaResultOfCircle = Pi * (radius * radius);

    public Circle(double radius) {
        super();
    }

    @Override
    public void area(){

        System.out.println("Area of circle is: " + areaResultOfCircle + " cm2");
    }

}
