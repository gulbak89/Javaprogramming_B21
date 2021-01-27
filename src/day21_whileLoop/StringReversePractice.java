package day21_whileLoop;

import java.util.Scanner;

public class StringReversePractice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.nextLine();

        String reverse="";



        for(int i=word.length()-1; i>=0; i--){
           // System.out.print(word.charAt(i)+" ");
            reverse+=word.charAt(i);
        }
        System.out.println(reverse);

        boolean isPalindrome=word.equalsIgnoreCase(reverse);
        System.out.println(word+" is a palindrome word is: "+isPalindrome);
    }
}
