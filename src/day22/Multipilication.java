package day22;

import java.util.Scanner;

public class Multipilication {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int n1=scan.nextInt();
        int n2=scan.nextInt();

        int result=0;


        for(int i=1; i<=n2; i++){

            result+=n1;
        }

        System.out.println(result);

    }
}
