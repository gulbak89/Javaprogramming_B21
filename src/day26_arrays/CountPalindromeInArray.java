package day26_arrays;

import java.util.Arrays;

public class CountPalindromeInArray {
    public static void main(String[] args) {

        String[] str= {"Anna", "hannah","good","Emma", "Chris", "Yasin","Talat"};
        int countPalindrome=0;


        for(int j=0; j<str.length; j++) {

            String original = str[j];    //"Anna"


            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed += original.charAt(i);
            }

            if (original.equalsIgnoreCase(reversed)) {
                countPalindrome++;
            }




        }
        System.out.println(countPalindrome);

    }
}
