package offineHours.practice_11_27;

import java.util.ArrayList;

public class ReversedArray2 {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};

        ArrayList<Integer> reverse=new ArrayList<>();

        for (int i=arr.length-1; i>=0; i--){
            reverse.add(arr[i]);
        }

        System.out.println(reverse);





    }

    public static ArrayList reversed(int[] arr){

        ArrayList<Integer> reverse=new ArrayList<>();

        for (int i=arr.length-1; i>=0; i--){
            reverse.add(arr[i]);
        }

        return reverse;

    }
}
