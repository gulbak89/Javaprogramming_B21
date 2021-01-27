package day21_whileLoop;

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the number you wanna enter:");
        double num= scan.nextDouble();

        double result=1;

        for(int i=(int)num; i>=1; i-- ){

                result*=i;


        }
        System.out.println("Factorial= "+result);
    }
}
