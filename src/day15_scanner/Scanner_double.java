package day15_scanner;
import java.util.Scanner;

public class Scanner_double {
    public static void main(String[] args) {

        Scanner decimal= new Scanner(System.in);
        System.out.println("Enter a double number");
        double num1 = decimal.nextDouble();
        System.out.println("double number is: "+num1);

        System.out.println("=========================");

        System.out.println("Enter a float number");
        float num2 = decimal.nextFloat();
        System.out.println("float number is: "+num2);

        System.out.println(decimal.nextFloat()+decimal.nextDouble());









    }
}
