package com.lveliz.designpatterns.solid.openclosed;

import java.util.stream.Stream;

interface Filter<T> {
    Stream<T> filter(Stream<T> items, Specification<T> spec);
}
