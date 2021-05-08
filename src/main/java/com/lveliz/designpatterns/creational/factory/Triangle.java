package com.lveliz.designpatterns.creational.factory;

class Triangle implements Shape {

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm a triangle");
    }

    @Override
    public String getName() {
        return "TRIANGLE";
    }
    
}
