package com.vinaylogics.solid.demo.models;

import com.vinaylogics.solid.demo.solid.dic.IAreaCalculator;
import com.vinaylogics.solid.demo.solid.ocp.Shape;

import java.util.List;

public class AreaCalculator implements IAreaCalculator {
    private int sum;
    @Override
    public int sum(List<Shape> shapes) {
        return (int) shapes.stream().mapToDouble(Shape::area).sum();
    }

}
