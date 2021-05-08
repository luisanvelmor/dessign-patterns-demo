package com.lveliz.designpatterns.solid.openclosed;

class ColorSpecification implements Specification<Shape> {

    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Shape item) {
        return item.getColor() == this.color;
    }

}
