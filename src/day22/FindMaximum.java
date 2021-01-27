package day22;

import java.util.Scanner;

public class FindMaximum {    //Enter 5 numbers and find the maximum number among them

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int max =-99999;    // user most likely enter a number that is greater than -99999



        for(int i=1; i<=5; i++){

            System.out.println("Enter a number");
            int n= scan.nextInt();   // -1, 3, 4, 5, 2

            if(n>max){
                max=n;
            }

        }

        System.out.println("Maximum number is: "+max);
        scan.close();

    }
}
