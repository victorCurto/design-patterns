package structuralPatterns.composite.example1;

import structuralPatterns.composite.example1.editor.ClientImageEditor;
import structuralPatterns.composite.example1.shapes.Circle;
import structuralPatterns.composite.example1.shapes.Rectangle;
import structuralPatterns.composite.example1.shapes.CompoundShape;
import structuralPatterns.composite.example1.shapes.Dot;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ClientImageEditor editor = new ClientImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
