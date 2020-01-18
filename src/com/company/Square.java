package com.company;

public class Square extends Figure implements AreaFinder {

    /*
    Вычисление площади квадрата по принципу:
    площадь равна квадрату стороны квадрата.
    */

    int areaResultOfSquare = side1 * side2;

    public Square(int side1, int side2, int side3, int side4) {
        super(side1, side2, side3, side4);
    }

    @Override
    public void area() {

        System.out.println("Area od square is: " + areaResultOfSquare + " cm2");
    }
}
