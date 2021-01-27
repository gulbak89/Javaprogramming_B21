package day15_scanner;

import java.util.Scanner;

public class Scanner_short {

    public static void main(String[] args) {
        System.out.println("input a short number");
        Scanner scan= new Scanner(System.in);

        short s = scan.nextShort();

        System.out.println("number is: "+ s);
        System.out.println("plus one is: "+(1+s));
        System.out.println(scan.nextShort());



    }
}
