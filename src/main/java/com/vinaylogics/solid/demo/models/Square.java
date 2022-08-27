package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class Square implements Shape {
    private int length;

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return  Math.pow(length, 2);
    }
}
