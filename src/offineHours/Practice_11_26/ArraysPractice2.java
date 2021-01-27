package offineHours.Practice_11_26;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {  // interview question

        String str="Today is a great day to celebrate the Thanksgiving by doing Java tasks";

        String[] arr=str.split(" ");
        String reverse="";

        for (int i=arr.length-1; i>=0; i--){
            reverse+=arr[i]+" ";


        }
        reverse=reverse.trim();

        System.out.println(reverse);

        System.out.println("================================");
        int[] arr1=new int[3];
        int[] arr2={1,2,3,4,5};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1));





    }
}
