package com.lveliz.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;

public final class ShapeFactory {

    public static enum Options {
        CIRCLE, TRIANGLE
    }

    private final Map<Options, Shape> products = new HashMap<Options, Shape>();

    public ShapeFactory() {
        products.put(Options.CIRCLE, new Circle());
        products.put(Options.TRIANGLE, new Triangle());
    }

    public Shape BuildShape(ShapeFactory.Options option) {
        return (Shape) products.get(option);
    }

}
