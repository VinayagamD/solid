package com.vinaylogics.solid.demo;

import com.vinaylogics.solid.demo.models.AreaCalculator;
import com.vinaylogics.solid.demo.models.Circle;
import com.vinaylogics.solid.demo.models.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = "+sum);
    }
}
