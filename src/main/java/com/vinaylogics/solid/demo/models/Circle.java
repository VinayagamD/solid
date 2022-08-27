package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class Circle implements Shape {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
       return Math.PI * Math.pow(radius, 2);
    }
}
