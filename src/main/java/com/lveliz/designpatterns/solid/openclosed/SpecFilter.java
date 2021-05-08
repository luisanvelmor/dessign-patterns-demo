package com.lveliz.designpatterns.solid.openclosed;

import java.util.stream.Stream;

class SpecFilter implements Filter<Shape> {

    @Override
    public Stream<Shape> filter(Stream<Shape> items, Specification<Shape> spec) {
        return items.filter(i -> spec.isSatisfied(i));
    }

}
