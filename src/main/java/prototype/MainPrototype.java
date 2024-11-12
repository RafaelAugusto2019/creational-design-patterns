package prototype;

import prototype.registry.ShapeRegistry;
import prototype.service.Shape;
import prototype.service.impls.Circle;
import prototype.service.impls.Square;

public class MainPrototype {

    public static void main(String [] args){
        ShapeRegistry shapeRegistry = new ShapeRegistry();

        shapeRegistry.addShape("square", new Square(10));
        shapeRegistry.addShape("circle", new Circle(20));

        Shape clonedCircle = shapeRegistry.getShape("circle");
        Shape clonedSquare = shapeRegistry.getShape("square");
        clonedSquare.setCustoms("my customizations");

        clonedSquare.draw();
        clonedCircle.draw();

        Shape clonedSquare2 = shapeRegistry.getShape("square");
        clonedSquare2.draw();
    }

}
