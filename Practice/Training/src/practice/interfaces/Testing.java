package practice.interfaces;

public class Testing implements Test1,Test2{

    @Override
    public void test() {
        System.out.println( "This is test1");

    }

    @Override
    public void display() {
        System.out.println( "This is test2");

    }

    // Interfaces are tested for multiple inheritence

    public static void main(String[] args) {
        Testing check = new Testing();
        Test2 check1 = new Testing();
        check.test();
        check1.display();
        System.out.println(Test1.add);
        System.out.println(Test2.add);

    }
}
