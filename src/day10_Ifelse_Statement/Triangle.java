package day10_Ifelse_Statement;

public class Triangle {
    public static void main(String[] args) {

        int angle1 = 30;
        int angle2 = 30;
        int angle3 = 100;

        int sumAngle = angle1+angle2+angle3;
        boolean triangleIsValid = sumAngle ==180;
        boolean nottriangle = sumAngle != 180;


        if(triangleIsValid) {
            System.out.println("it is a valid triangle");
        }

        if(nottriangle) {

            System.out.println("it is not a valid triangle");
        }
    }
}
