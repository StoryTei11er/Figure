package com.company;

public class Square extends Figure implements GetArea {

    /*
    Вычисление площади квадрата по принципу:
    площадь равна квадрату стороны квадрата.
    */

    int side1 = 4;
    int side2 = 4;
    int areaResultOfSquare = side1 * side2;

    @Override
    public void area() {

        System.out.println("Area od square is: " + areaResultOfSquare + " cm2");
    }
}
