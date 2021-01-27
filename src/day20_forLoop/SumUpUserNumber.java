package day20_forLoop;

import java.util.Scanner;

public class SumUpUserNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many times you wanna enter the numbers?");

        int times=scan.nextInt();  // how many numbers user wants to enter
        int result=0;   // to contain the sum of each user number

        for(int i=1; i<=times; i++){  // we allowed the user to decide how many number she/he wants to enter
            System.out.println("Enter a number");
            result+=scan.nextInt();   // each user input will be added to result
        }

        System.out.println(result);

        scan.close();

    }
}
