package practice.singleton;

public class BillPugh {
    /*
    ✅ Pros:
    Lazy initialization

    Thread-safe without synchronization

    Efficient

    ❌ Cons:
    None really, this is one of the most recommended ways in modern Java.

    Reflection attacks causes multiple object creation.
     */

    private BillPugh() {}

    private static class Holder {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {

        return Holder.instance;
    }
}
