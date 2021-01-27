package day20_forLoop;

import java.util.Scanner;

public class SumUp5Numbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       /* System.out.println("Please enter 5 numbers");
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        int n4=scan.nextInt();
        int n5=scan.nextInt();

        System.out.println("Sum of those 5 numbers are: "+(n1+n2+n3+n4+n5));*/
       int result=0;
       for(int i= 1; i<=5; i++){

           System.out.println("Enter a number:");
           result+=scan.nextInt();

       }
        System.out.println("sum of those 5 number is: "+result);




    }
}
