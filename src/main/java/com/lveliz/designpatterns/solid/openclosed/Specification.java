package com.lveliz.designpatterns.solid.openclosed;

interface Specification<T> {
    boolean isSatisfied(T item);
}
