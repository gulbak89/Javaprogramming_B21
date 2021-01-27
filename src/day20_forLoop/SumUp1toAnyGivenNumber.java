package day20_forLoop;

import java.util.Scanner;

public class SumUp1toAnyGivenNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your number:");
        int num=scan.nextInt();

        int result=0;

        if(num>=1) {

            for (int i = 1; i <= num; i++) {
                result += i;
            }

            System.out.println(result);
        }else{
            System.out.println("Invalid number");
        }

        scan.close();


    }
}
