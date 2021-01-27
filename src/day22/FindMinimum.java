package day22;

import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int min=10000000;

        for(int i=1; i<=5; i++){

            System.out.println("Enter a number");
            int n=scan.nextInt();

            if(n<min){
                min=n;
            }

            System.out.println("minimum number is: "+min);
        }
    }
}
