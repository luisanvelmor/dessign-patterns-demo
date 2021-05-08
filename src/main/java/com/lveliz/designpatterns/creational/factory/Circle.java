package com.lveliz.designpatterns.creational.factory;

class Circle implements Shape {

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm a circle");
    }

    @Override
    public String getName() {
        return "CIRCLE";
    }
    
}
