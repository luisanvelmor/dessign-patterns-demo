package com.lveliz.designpatterns.solid.openclosed;

import java.util.ArrayList;
import java.util.List;

public class OpenClosedDemo {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<Shape>();

        Shape shape1 = new Shape();
        shape1.setName("square");
        shape1.setColor(Color.RED);
        shape1.setSize(Size.SMALL);

        Shape shape2 = new Shape();
        shape2.setName("triangle");
        shape2.setColor(Color.BLUE);
        shape2.setSize(Size.SMALL);

        shapes.add(shape1);
        shapes.add(shape2);

        SpecFilter specFilter = new SpecFilter();

        // RED SHAPES
        System.out.println("RED SHAPES");
        ColorSpecification colorSpec = new ColorSpecification(Color.RED);
        specFilter.filter(shapes.stream(), colorSpec).forEach(s -> {
            System.out.println("The " + s.getName() + " is " + s.getColor());
        });

        // SMALL SHAPES
        System.out.println("\nSMALL SHAPES");
        SizeSpecification sizeSpec = new SizeSpecification(Size.SMALL);
        specFilter.filter(shapes.stream(), sizeSpec).forEach(s -> {
            System.out.println("The " + s.getName() + " is " + s.getSize());
        });

    }

}
