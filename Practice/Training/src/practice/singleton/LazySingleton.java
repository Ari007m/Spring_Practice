package practice.singleton;

public class LazySingleton {
    /*
    ✅ Pros:
    Instance is created only when needed.

    ❌ Cons:
    Not thread-safe. Two threads can create two instances simultaneously.
     */

    private static LazySingleton instance ;

    LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){

            try {
                Thread.sleep(500); // Bigger delay to let each loop create separate object
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }
}
