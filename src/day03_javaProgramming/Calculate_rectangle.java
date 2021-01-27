package day03_javaProgramming;

public class Calculate_rectangle { // length and width of the rectangle are 20 and 10 respectively

    public static void main(String[] args) {

        int length = 20; // declare variable l, and assign 20 to it
        int width = 5; // declare variable w, and assign 10 to it
        int area = width * length;
        int primeter = width * 2 + length * 2;

        System.out.println("Area is: ");

        System.out.println(area);  // we can code it as width * Length if we didn't declare the area

        System.out.println(" Primeter is: ");
        System.out.println(primeter);




    }
}
