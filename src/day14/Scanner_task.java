package day14;

import java.util.Scanner;

public class Scanner_task {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("please enter your age");
        byte age= scan.nextByte();
        System.out.println("your age is: "+age);

        System.out.println();

        System.out.println("Please enter your favorite number");
        long FavNum= scan.nextLong();
        System.out.println("Your Favorite number is: "+ FavNum);

        System.out.println();


        System.out.println("you are a student");
        boolean Student = true;



        System.out.println(!Student);

    }



}
