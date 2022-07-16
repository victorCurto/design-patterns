package CreationalPatterns.Singleton.example1;

public class Singleton_Eager_Initialization {

    private static final Singleton_Eager_Initialization firstInstance = new Singleton_Eager_Initialization();

    private Singleton_Eager_Initialization(){}

    public static Singleton_Eager_Initialization getInstance(){
        return firstInstance;
    }
}
