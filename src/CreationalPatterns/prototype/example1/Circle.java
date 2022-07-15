package CreationalPatterns.prototype.example1;

public class Circle implements IShape {

    int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String draw() {
        return "Draw a CIRCLE";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this;
    }
}
