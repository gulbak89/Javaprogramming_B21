package day15_scanner;

import java.util.Scanner;  // import, package name (java.util), class name (Scanner)

public class Scanner_intro {   // pic: always put package first, then import, then class from top to bottom
    public static void main(String[] args) {


        System.out.println("enter a byte number");
      Scanner input= new Scanner(System.in);
          byte b =input.nextByte();
        System.out.println("our nuber is "+ b);
        System.out.println("plus one: "+(b+1));





    }
}
