package com.vinaylogics.solid.demo.solid.lsp;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

public class NoShape implements Shape {
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
