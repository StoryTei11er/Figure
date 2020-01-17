package com.company;

public abstract class Figure {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        triangle.area();
        square.area();
        rectangle.area();
        circle.area();
    }

    private static void area(GetArea triangle) {
    }

}



