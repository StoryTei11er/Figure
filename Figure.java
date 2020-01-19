package com.company;

public abstract class Figure {

    int side1;
    int side2;
    int side3;
    int side4;

    public Figure() {

    }

    public Figure(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Figure(int side1, int side2, int side3, int side4){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    void area() {

    }
}



