package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10.0, 5.0, 10.0);
        Square square = new Square(4.0, 4.0, 4.0, 4.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0, 10.0, 5.0);
        Circle circle = new Circle(7.0);

        triangle.area();
        square.area();
        rectangle.area();
        circle.area();
    }
}
