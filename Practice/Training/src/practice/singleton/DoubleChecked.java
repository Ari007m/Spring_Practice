package practice.singleton;

public class DoubleChecked {
    /*
    ✅ Pros:
    Thread-safe.
    Fast after first initialization.
    Uses memory efficiently.

    ❌ Cons:
    Slightly more complex code.
     */

    private static volatile DoubleChecked instance;

    private DoubleChecked() {}

    public static DoubleChecked getInstance() {
        if (instance == null) { // 1st check (no locking)
            synchronized (DoubleChecked.class) {
                if (instance == null) { // 2nd check (with locking)
                    instance = new DoubleChecked();
                }
            }
        }
        return instance;
    }
}
