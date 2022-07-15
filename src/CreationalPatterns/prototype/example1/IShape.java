package CreationalPatterns.prototype.example1;

public interface IShape {
    String draw();
    Object clone() throws CloneNotSupportedException;
}
