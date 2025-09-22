package practice.exceptionhandling;

public class Errors {


    public static void main(String[] args) {
        final int i = 2;
        int j = 0 ;

        // final can be used for class , method  and variables

        int[] a = new int[3];
        try
        {
             j = 7/i; // for / by zero exception
            System.out.println(a[3]);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Be in your Limit");
        }

    }
}
