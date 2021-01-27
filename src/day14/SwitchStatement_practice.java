package day14;

public class SwitchStatement_practice {

    public static void main(String[] args) {

        int a = 100;

        switch (a) {     //  long, double. float, boolean can not be accepted in switch statement

            case 3:
                System.out.println("good");
                break;
            case 100:
                System.out.println("yes");
                break;
            default:
                System.out.println("Invalid");
                break;

        }
    }
}
