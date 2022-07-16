package CreationalPatterns.Singleton.example2;

public final class Singleton_NoThreadSafe {
    private static Singleton_NoThreadSafe instance;
    public String value;

    private Singleton_NoThreadSafe(String value) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton_NoThreadSafe getInstance(String value) {
        if (instance == null) {
            instance = new Singleton_NoThreadSafe(value);
        }
        return instance;
    }
}

