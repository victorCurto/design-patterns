package CreationalPatterns.Singleton.example2;

public class DemoClient_NoThreadSafe {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yes)" + "\n" +
                "If you see different values, then 2 singletons were created (no)" + "\n\n" +
                "RESULT:" + "\n");
/*
        System.out.println("With a single thread :");
        Singleton_NoThreadSafe singleton = Singleton_NoThreadSafe.getInstance("FOO");
        Singleton_NoThreadSafe anotherSingleton = Singleton_NoThreadSafe.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
*/

        System.out.println("\n\nWith two threads :");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton_NoThreadSafe singleton = Singleton_NoThreadSafe.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton_NoThreadSafe singleton = Singleton_NoThreadSafe.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
