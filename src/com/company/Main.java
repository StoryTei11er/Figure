package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(10,5,10);
        Square square = new Square(4,4,4,4);
        Rectangle rectangle = new Rectangle(10,5,10,5);
        Circle circle = new Circle(6);

        triangle.area();
        square.area();
        rectangle.area();
        circle.area();


    }

}
