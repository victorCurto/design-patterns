package CreationalPatterns.Prototype;

public interface IShape {
    String draw();
    Object clone() throws CloneNotSupportedException;
}
