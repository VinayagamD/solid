package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class Cube implements Shape {
    private int area;

    public Cube(int area) {
        this.area = area;
    }

    @Override
    public double area() {
        return 6 * Math.pow(area, 2);
    }
}
