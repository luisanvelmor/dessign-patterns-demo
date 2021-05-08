package com.lveliz.designpatterns.structural.adapter.withoutcaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    private final static List<Vector> vectorObjects = new ArrayList<>(
            Arrays.asList(new VectorRectangle(1, 1, 10, 10), new VectorRectangle(3, 3, 6, 6)));

    public static void main(String[] args) {
        draw();
    }

    public static void drawPoint(Point p) {
        System.out.println(".");
    }

    private static void draw() {
        for (Vector vo : vectorObjects) {
            for (Line line : vo) {
                LineToPointAdapter adapter = new LineToPointAdapter(line);
                adapter.forEach(AdapterDemo::drawPoint);
            }
        }
    }

}
