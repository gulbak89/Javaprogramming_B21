package day22;

import java.util.Scanner;

public class DivisionAndRemainder2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int a= scan.nextInt();
        int b=scan.nextInt();

        int count=0;

        for(count=0; a>=b; count++){
            a-=b;
        }

        System.out.println(count+" with a remainder of "+a);



    }
}
