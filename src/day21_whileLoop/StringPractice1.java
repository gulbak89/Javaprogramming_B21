package day21_whileLoop;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String");

        String str= scan.nextLine();

        char first=str.charAt(0);
        char last=str.charAt(str.length()-1);

        System.out.println("first character of the string is: "+ first);
        System.out.println("Last character of thr string is: "+ last);
        System.out.println(first+last);     // it will return a number, because in char, every character has a number==> "+" serves as addition
        System.out.println(""+first+last);   // so here we add a string "" to make "+" as a concatenation


        System.out.println("=========================================");

        while(true) {
            System.out.println("Enter your building number");
            String buildNum = scan.next();

            scan.nextLine();

            System.out.println("Enter your street name");
            String StrName = scan.nextLine();

            System.out.println("Enter the apartment number");
            String AptNum = scan.next();

            scan.nextLine();

            System.out.println("Enter your city name");
            String city = scan.nextLine();

            System.out.println("Enter your state name");
            String state = scan.nextLine();

            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();

            System.out.println("Address: " + buildNum + ", " + StrName + ", " + city + ", " + state + ", " + zipCode);

            System.out.println("Would you like to continue? yes or no");
            String answer = scan.next();

            if(answer.equalsIgnoreCase("no")){
                break;


            }
            scan.close();


        }








    }
}
