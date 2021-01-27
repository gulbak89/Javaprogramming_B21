package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChar {

    public static void main(String[] args) {

        String str = "aabbbdf";
        char[] arr = str.toCharArray();

        //char[] arr=str.split("");

        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length; j++) {
            char ch = arr[j];
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (ch == arr[i]) {
                    count++;
                }


                }
            if (count == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}