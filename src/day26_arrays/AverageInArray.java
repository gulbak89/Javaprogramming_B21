package day26_arrays;

import java.util.Scanner;

public class AverageInArray {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many number you wanna enter?");
        int length=scan.nextInt();

        int[] num=new int[length];

        for(int i=0; i<length; i++){
            System.out.println("Enter the numbers:");
            num[i] =scan.nextInt();
        }

        int sum=0;

        for(int i=0; i<length; i++){

            sum+=num[i];

        }

        double average=(double)sum/length;

        System.out.println("Average is: "+average);
    }

}
