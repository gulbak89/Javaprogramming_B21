package day19_loop;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a word");
        String word= scan.nextLine();

        if(word.toLowerCase().startsWith("x")){

            System.out.println(word.substring(1));

        }else{
            System.out.println(word);
        }

        System.out.println("========================");

        if(word.charAt(0)=='x'||word.charAt(0)=='X'){
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }
        System.out.println("===============================");

        if(word.substring(0,1).equalsIgnoreCase("x")){
            System.out.println(word.substring(1));
        }else{

            System.out.println(word);
        }
        scan.close();

    }
}
