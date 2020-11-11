package offineHours.practice_11_11;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        String str1="abcdefg";
        String str2="GABDECF";

        String[] arr1= str1.toUpperCase().split("");
        String[] arr2=str2.split("");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println();




        Arrays.sort(arr2);
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        boolean isAnagram=Arrays.equals(arr1,arr2);
        System.out.println();
        System.out.println(isAnagram);





    }
}
