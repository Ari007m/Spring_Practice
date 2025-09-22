package practice.enumaration;

public enum Test {
    GREAT,GOOD,AVERAGE, NOT_BAD , BAD ;
}
class Tests{
    public static void main(String[] args) {
        Test grade = Test.BAD;

        switch(grade){
            case GREAT :
                System.out.println("Nice");
                break;
            case GOOD :
                System.out.println("Good");
                break;
            case AVERAGE :
                System.out.println("Ok");
                break;
            case NOT_BAD :
                System.out.println("Not Bad");
                break;
            default:
                System.out.println("Very Bad");
                break;
        }
    }

}
