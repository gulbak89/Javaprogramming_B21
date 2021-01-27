package day22;

import java.util.Scanner;

public class DevisionAndRemainder {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two numbers");
        int n1= scan.nextInt();
        int n2=scan.nextInt();

        int count=0;    // every time we subtracted n1-n2, we count it as 1, and count down how many time we did the subtraction

        while(n1>=n2){
            n1-=n2;
            count++;
        }

        System.out.println(count+" with a remainder of"+ n1);


    }
}

/*
10/3=3.333( 3 as division , and 1 as remainder)

10-3=7
7-3=4
4-3=1   ( 1 is remainder)





 */
