package com.lveliz.designpatterns.solid.openclosed;

class SizeSpecification implements Specification<Shape> {

    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Shape item) {
        return item.getSize() == this.size;
    }

}
