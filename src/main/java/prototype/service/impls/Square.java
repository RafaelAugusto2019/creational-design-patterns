package prototype.service.impls;

import prototype.service.Shape;

public class Square implements Shape {

    private int sideSize;
    private String customs;

    public Square(int sideSize){
        this.sideSize = sideSize;
    }

    @Override
    public Shape clone() {
        return new Square(this.sideSize);
    }

    @Override
    public void setCustoms(String customs) {
        this.customs = customs;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square: " + sideSize + "x" + sideSize + " customizations: " + customs);
    }
}
