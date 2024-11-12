package prototype.service.impls;

import prototype.service.Shape;

public class Circle implements Shape {

    private int radius;
    private String customs;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    @Override
    public void setCustoms(String customs) {
        this.customs = customs;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius = " + radius + " customizations: " + customs);
    }
}
