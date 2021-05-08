package com.lveliz.designpatterns.solid.openclosed;

class Shape {

    private String name;
    private Color color;
    private Size size;

    public Shape() { }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
