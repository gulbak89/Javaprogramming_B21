package day29_methods;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr={1,3,5,6,9};
        addElement(arr,8);


    }

    public static void addElement(int[] arr, int num){
        int[] result=new int[arr.length+1];
        for (int i=0; i<=arr.length-1; i++){
            result[i] = arr[i];

        }
        result[result.length-1]=num;
        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
    }



}
