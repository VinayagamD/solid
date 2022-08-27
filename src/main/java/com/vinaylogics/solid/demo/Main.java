package com.vinaylogics.solid.demo;

import com.vinaylogics.solid.demo.models.*;
import com.vinaylogics.solid.demo.solid.lsp.NoShape;
import com.vinaylogics.solid.demo.solid.ocp.Shape;
import com.vinaylogics.solid.demo.solid.srp.ShapesPrinter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube(10);
        NoShape noShape = new NoShape();
        Rectangle rectangle = new Rectangle(20, 20);
        List<Shape> shapes = List.of(
                circle,
                square,
                cube,
                rectangle
        );
        ShapesPrinter printer = new ShapesPrinter();
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}
