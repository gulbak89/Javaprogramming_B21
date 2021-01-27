package day20_forLoop;

import java.util.Scanner;

public class PalindromeTest {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a String:");
        String str= scan.nextLine();

        String result="";

        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println("Result: "+result);

        if(str.equalsIgnoreCase(result)){

            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }

        scan.close();

        //System.out.println(str+(result.equalsIgnoreCase(str)? "is palindrome":"is not palindrome");
    }

}
