package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class Rectangle implements Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
