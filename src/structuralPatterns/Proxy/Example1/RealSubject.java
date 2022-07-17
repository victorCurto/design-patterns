package structuralPatterns.Proxy.Example1;

public class RealSubject implements ISubject{

    @Override
    public void foo() {
        System.out.println("Running the method in the real object");
    }
}
