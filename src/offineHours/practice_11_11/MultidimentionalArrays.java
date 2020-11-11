package offineHours.practice_11_11;

import java.util.Arrays;

public class MultidimentionalArrays {

    public static void main(String[] args) {

        int[] arr1D={1,2,3,4,5};

        int[][] arr2D={{1,2,3},{4,5}};


        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("============================================");

        for (int[] each1:arr2D){

            for (int each: each1){

                if(each%2==0) {

                    System.out.println(each);
                }
            }
        }


    }
}
