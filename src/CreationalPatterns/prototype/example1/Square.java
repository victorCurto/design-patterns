package CreationalPatterns.prototype.example1;

public class Square implements IShape {

    int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String draw() {
        return "Draw a Square";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this;
    }
}
