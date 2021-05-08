package com.lveliz.designpatterns.structural.adapter.example;

public class AdapterDemo {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println("\nSQUARE PEG ADAPTER");
        print(peg.getRadius(), hole.getRadius(), hole.fits(peg));

        SquarePeg squarePeg1 = new SquarePeg(2);
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg1);
        System.out.println("\nROUND PEG ADAPTER 1");
        print(squarePeg1.getWidth(), hole.getRadius(), hole.fits(adapter));

        SquarePeg squarePeg2 = new SquarePeg(20);
        adapter = new SquarePegAdapter(squarePeg2);
        System.out.println("\nROUND PEG ADAPTER 2");
        print(squarePeg2.getWidth(), hole.getRadius(), hole.fits(adapter));

    }

    private static void print(double pegDimension, double holeRadius, boolean flag) {
        System.out.println(String.format("A %.0fcm peg %s in a %.0fcm hole", pegDimension,
                flag ? "fits" : "doesn't fit", holeRadius));
    }

}
