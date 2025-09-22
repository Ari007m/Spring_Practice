package practice.singleton;

public class SynchronizedSingleton {

    /*
    ✅ Pros:
    Simple and thread-safe.

    ❌ Cons:
    Performance hit due to synchronization every time you call getInstance().
     */
    private static SynchronizedSingleton instance ;

    SynchronizedSingleton(){}

    public static synchronized SynchronizedSingleton getInstance(){
        if(instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
