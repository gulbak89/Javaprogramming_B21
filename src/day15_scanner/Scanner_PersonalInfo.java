package day15_scanner;

import java.util.Scanner;

public class Scanner_PersonalInfo {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);

        System.out.println("Enter your age");
        byte age= info.nextByte();


        System.out.println();

        System.out.println("Enter your favorite number");
        long FavNum= info.nextLong();

        System.out.println();

        System.out.println("Are you a student? Enter true or false");
        boolean Student= info.nextBoolean();

        System.out.println();
        System.out.println("=====================================");


        System.out.println("your age is "+age);
        System.out.println("Your favorite number is "+FavNum);

        if(Student) {
            System.out.println("Great, You are a student!");
        }else {
            System.out.println("Oh okay, you are not a student");
        }





    }




}
