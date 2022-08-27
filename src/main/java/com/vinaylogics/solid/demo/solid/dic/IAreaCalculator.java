package com.vinaylogics.solid.demo.solid.dic;

import com.vinaylogics.solid.demo.solid.ocp.Shape;

import java.util.List;

public interface IAreaCalculator {
    int sum(List<Shape> shapes);
}
