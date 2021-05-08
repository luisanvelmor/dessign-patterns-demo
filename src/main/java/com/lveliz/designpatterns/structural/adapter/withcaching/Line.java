package com.lveliz.designpatterns.structural.adapter.withcaching;

import java.util.Objects;

public class Line {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.start);
        hash = 37 * hash + Objects.hashCode(this.end);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Line other = (Line) o;
        if (!Objects.equals(this.start, other.start)) {
            return false;
        }
        return Objects.equals(this.end, other.end);
    }

}
