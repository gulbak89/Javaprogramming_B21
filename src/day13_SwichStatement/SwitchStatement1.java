package day13_SwichStatement;

public class SwitchStatement1 {

    public static void main(String[] args) {

        switch(2) {     // boolean, long, double , float can not be accepted in the switch statement.
            case 1 :
                System.out.println("one");
                break;


            case 2:
                System.out.println("two");
                break;


            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("Invalid Case");
                break;


        }
    }
}
