package day27_ForEachLoop;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String[] names={"amat", "semet", "anna", "sara"};

        for (String each: names){

           String reverse="";

           for(int i=each.length()-1; i>=0; i--){

               reverse+=each.charAt(i);
           }

            System.out.print(reverse+" ");







        }



    }
}
