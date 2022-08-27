package com.vinaylogics.solid.demo;

import com.vinaylogics.solid.demo.models.AreaCalculator;
import com.vinaylogics.solid.demo.models.Circle;
import com.vinaylogics.solid.demo.models.Cube;
import com.vinaylogics.solid.demo.solid.ocp.Shape;
import com.vinaylogics.solid.demo.solid.srp.ShapesPrinter;
import com.vinaylogics.solid.demo.models.Square;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        List<Shape> shapes = List.of(circle, square, cube);
        ShapesPrinter printer = new ShapesPrinter();
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
