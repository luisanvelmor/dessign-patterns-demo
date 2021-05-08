package com.lveliz.designpatterns.structural.adapter.withcaching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LineToPointAdapter implements Iterable<Point> {

    private static int count = 0;
    private static Map<Integer, List<Point>> cache = new HashMap<Integer, List<Point>>();
    private int hash;

    public LineToPointAdapter(Line line) {

        hash = line.hashCode();

        if (cache.get(hash) != null) {
            return;
        }

        System.out.println(String.format("%d: Generating points for line [%d,%d]-[%d,%d] (with caching)", ++count,
                line.getStart().getX(), line.getStart().getY(), line.getEnd().getX(), line.getEnd().getY()));

        ArrayList<Point> points = new ArrayList<Point>();

        int left = Math.min(line.getStart().getX(), line.getEnd().getX());
        int right = Math.max(line.getStart().getX(), line.getEnd().getX());
        int top = Math.min(line.getStart().getY(), line.getEnd().getY());
        int bottom = Math.max(line.getStart().getY(), line.getEnd().getY());
        int dx = right - left;
        int dy = line.getEnd().getY() - line.getStart().getY();

        if (dx == 0) {
            for (int y = top; y <= bottom; ++y) {
                points.add(new Point(left, y));
            }
        } else if (dy == 0) {
            for (int x = left; x <= right; ++x) {
                points.add(new Point(x, top));
            }
        }

        cache.put(hash, points);

    }

    @Override
    public Iterator<Point> iterator() {
        return cache.get(hash).iterator();
    }

    @Override
    public Spliterator<Point> spliterator() {
        return cache.get(hash).spliterator();
    }

    @Override
    public void forEach(Consumer<? super Point> action) {
        cache.get(hash).forEach(action);
    }

}
