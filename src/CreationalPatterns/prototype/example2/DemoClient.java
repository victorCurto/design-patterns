package CreationalPatterns.prototype.example2;

import CreationalPatterns.prototype.example2.products.Circle;
import CreationalPatterns.prototype.example2.products.Rectangle;
import CreationalPatterns.prototype.example2.products.ShapePrototype;

import java.util.ArrayList;
import java.util.List;

public class DemoClient {
    public static void main(String[] args) {
        List<ShapePrototype> shapes = new ArrayList<>();
        List<ShapePrototype> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<ShapePrototype> shapes, List<ShapePrototype> shapesCopy) {
        for (ShapePrototype shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yes)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yes)");
                } else {
                    System.out.println(i + ": But they are not identical (no)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (no)");
            }
        }
    }
}
