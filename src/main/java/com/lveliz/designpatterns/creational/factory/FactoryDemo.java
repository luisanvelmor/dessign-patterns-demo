package com.lveliz.designpatterns.creational.factory;

public class FactoryDemo {

    public static void main (String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape myShape = factory.BuildShape(ShapeFactory.Options.CIRCLE);
        myShape.sayHello();

        myShape = factory.BuildShape(ShapeFactory.Options.TRIANGLE);
        myShape.sayHello();

    }
    
}
