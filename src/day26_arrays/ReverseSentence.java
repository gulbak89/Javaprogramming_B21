package day26_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String sentence = scan.nextLine();

        String[] array=sentence.split(" ");

        System.out.println(Arrays.toString(array));

        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }

        scan.close();

    }

}
