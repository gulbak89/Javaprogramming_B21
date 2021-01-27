package day26_arrays;

import java.util.Arrays;

public class ArrayDiscendingOrder {

    public static void main(String[] args) {

        int[] num={1,4,3,2,8,5,9};
        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        int[] descending=new int[num.length];

        for(int i=num.length-1, j=0; i>=0; i--,j++){
           // System.out.print(num[i]+" ");
            descending[j]=num[i];

        }

        System.out.println(Arrays.toString(descending));




    }
}
