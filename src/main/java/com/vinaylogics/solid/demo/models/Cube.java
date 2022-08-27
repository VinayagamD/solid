package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class Cube implements Shape {
    @Override
    public double area() {
        return 100;
    }
}
