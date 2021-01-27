package day19_loop;

import java.util.Scanner;

public class StringPractice2 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scan.nextLine();

        if(word.substring(word.length()-2).equalsIgnoreCase("ly")) {
            System.out.println("Really???");
        }else{
            System.out.println("Never mind");
        }

        System.out.println("====================================");

        if(word.endsWith("ly")){
            System.out.println("Really???");
        }else{
            System.out.println("Never mind");
        }

        System.out.println("====================================");
        System.out.println((word.endsWith("ly"))?"Really???":"never mind");

    }
}
