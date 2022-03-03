package CreationalPatterns.Singleton;

public class Singleton_Eager_Initialization {

    private static final Singleton_Eager_Initialization firstInstance = new Singleton_Eager_Initialization();

    public static Singleton_Eager_Initialization getInstance(){
        return firstInstance;
    }
}
