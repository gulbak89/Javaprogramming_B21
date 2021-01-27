package day10_Ifelse_Statement;

public class Rectangle {
    public static void main(String[] args) {

        int angle1 = 90;
        int angle2 = 90;
        int angle3 = 90;
        int angle4 = 90;

        boolean isValidRectangle = angle1==90 && angle2==90 && angle3 ==90 && angle4 ==90;

        if(isValidRectangle) {

            System.out.println("It is a valid rectangle");
        } else {                   // if there are only two possible outcomes, then we can use if-else statement.

            System.out.println("It is not a valid rectangle");
        }

        int a = 200;
        int b = 3000;
        int max = 0;
        String ismax= "Maximum number is ";

        if(a>b) {
           max=a;
        } else {
            max=b;
        }

        System.out.println(ismax+ max);



    }
}
