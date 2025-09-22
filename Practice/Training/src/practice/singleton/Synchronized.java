package practice.singleton;

public class Synchronized {
    public static void main(String[] args) {

        Runnable task = () -> {
            SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> Singleton instance hash: " + singleton.hashCode());
        };

        Thread thread2 = new Thread(task, "Thread - 2");
        Thread thread1 = new Thread(task, "Thread - 1");

        thread2.start();
        thread1.start();
    }
}
