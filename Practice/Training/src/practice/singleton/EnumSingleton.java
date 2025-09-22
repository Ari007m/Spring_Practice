package practice.singleton;

public enum EnumSingleton {
    /*
    ✅ Pros:
    Easiest and thread-safe by default.

    Serialization safe (avoids creating new instance on deserialization).

    Defense against reflection attacks.

    ❌ Cons:

    Not suitable if your Singleton needs to extend a class (Java enums can't extend classes).
     */

    INSTANCE;

    public void someMethod() {
        System.out.println("Doing something...");
    }
}
