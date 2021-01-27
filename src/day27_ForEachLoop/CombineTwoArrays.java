package day27_ForEachLoop;

import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {


        int[] num1 = {1, 3, 5, 7,9};
        int[] num2 = {2, 4, 6, 8};



        int[] num3=new int[num1.length+num2.length];

        int j=0; // represents index numbers of Third Array we created "num3"

        for (int each1: num1){
            num3[j]=each1;
            j++;

        }

        for (int each2:num2){

            num3[j]=each2;
            j++;

        }

        Arrays.sort(num3);
        System.out.println(Arrays.toString(num3));





    }
}