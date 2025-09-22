package practice.singleton;

public class Eager{
    public static void main(String[] args) {
        EagerSingleton a = EagerSingleton.getInstance();
        EagerSingleton b = EagerSingleton.getInstance();

        System.out.println(a.hashCode() == b.hashCode());

    }
}
