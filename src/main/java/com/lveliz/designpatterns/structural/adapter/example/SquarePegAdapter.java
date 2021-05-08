package com.lveliz.designpatterns.structural.adapter.example;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        int factor = 2;
        return (Math.sqrt(Math.pow((peg.getWidth() / factor), factor)) * factor);
    }

}
