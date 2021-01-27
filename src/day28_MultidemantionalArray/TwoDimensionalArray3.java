package day28_MultidemantionalArray;

import java.util.Arrays;

public class TwoDimensionalArray3 {

    public static void main(String[] args) {



        int[][] arr2D={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for(int i=arr2D.length-1; i>=0; i--){

            System.out.println(Arrays.toString(arr2D[i]));

        }

        System.out.println("======================================");



        for(int i=arr2D.length-1; i>=0; i--){

            for (int each: arr2D[i]){

                System.out.print(each+" ");
            }

            System.out.println();

        }

        System.out.println("=============================");
        for (int[] each: arr2D){

            for(int i=each.length-1; i>=0; i--){

                System.out.print(each[i]+" ");
            }

            System.out.println();
        }

        System.out.println("==============================");

        for (int i=arr2D.length-1; i>=0; i--){
            for(int j=arr2D[i].length-1; j>=0; j--){

                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }


    }
}
