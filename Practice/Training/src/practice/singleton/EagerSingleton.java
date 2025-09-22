package practice.singleton;

public class EagerSingleton {
    /*
    ✅ Pros:
    Thread-safe (because instance is created at class-loading time).

    Simple to implement.

    ❌ Cons:

    Instance is created even if never used (wastes memory).
     */

    private static final EagerSingleton instance = new EagerSingleton();

    EagerSingleton(){}

    public static EagerSingleton getInstance(){

        return instance;
    }
}

