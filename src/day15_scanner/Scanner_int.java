package day15_scanner;

import java.util.Scanner;
public class Scanner_int {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter number 1");
        int num1= scan.nextInt();// reading an int number
        // int a = 5; ==> it is hard coding/fixed value. but with Scanner the value can be dynamic

        System.out.println("Enter number2");
        int num2 = scan.nextInt();

        System.out.println("number 1 is: "+num1);
        System.out.println("number 2 is: "+num2);

        System.out.println("sum of num1 and num2 is: "+(num1+num2));





    }
}
