package behavioralPatterns.visitor.example1.visitor;

import behavioralPatterns.visitor.example1.elements.Circle;
import behavioralPatterns.visitor.example1.elements.CompoundShape;
import behavioralPatterns.visitor.example1.elements.Dot;
import behavioralPatterns.visitor.example1.elements.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}