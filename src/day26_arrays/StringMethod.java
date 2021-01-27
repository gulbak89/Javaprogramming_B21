package day26_arrays;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {   // *interview question

        String str="abcdsej";
        String str2="badcjss";
        char[] array= str.toCharArray();
        char[] array2=str2.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);

        if(Arrays.equals(array,array2)){
            System.out.println(true);

        }else{
            System.out.println(false);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        System.out.println("=================================");

        String sentence="Today is a great day";
        String[] Array=sentence.split(" ");

        System.out.println(Arrays.toString(Array));

        System.out.println(Array.length);


    }
}
