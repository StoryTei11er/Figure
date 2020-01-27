package com.company;

public class Square extends Figure {

    /*
    Вычисление площади квадрата по принципу:
    площадь равна квадрату стороны квадрата.
    */
    private double side1;
    private double side2;
    private double side3;
    private double side4;


    public Square(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    void area() {
        double areaResultOfSquare = side1 * side2;
        System.out.println("Area od square is: " + areaResultOfSquare + " cm2");
    }
}
