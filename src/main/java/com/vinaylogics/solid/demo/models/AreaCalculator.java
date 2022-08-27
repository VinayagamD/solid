package com.vinaylogics.solid.demo.models;

import java.util.List;

public class AreaCalculator {
    public int sum(List<Object> shapes) {
        return  (int) shapes.stream().mapToDouble(shape -> {
            if(shape instanceof Square){
                return Math.pow((((Square) shape).getLength()), 2);
            } if(shape instanceof Circle) {
                return  Math.PI * Math.pow((((Circle) shape).getRadius()), 2);
            }
            return 0;
        }).sum();
    }


}
