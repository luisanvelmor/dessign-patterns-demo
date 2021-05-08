package com.lveliz.designpatterns.structural.adapter.example;

public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSquare() {
        int raisedPower = 2;
        return Math.pow(this.width, raisedPower);
    }

}
