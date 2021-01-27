package offineHours.practice_11_27;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {


        int[] arr={10,20,30,40};

        int[] reversed = new int[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }

        System.out.println(Arrays.toString(reversed));

        System.out.println(Arrays.toString(reversedArray(arr)));

    }
    public static int[] reversedArray(int[] arr){

        int[] reversed = new int[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }
        return reversed;


    }
}
