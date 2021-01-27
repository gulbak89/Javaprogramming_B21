package day28_MultidemantionalArray;

import java.util.Arrays;

public class MultidimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2, 3}, {4, 5, 6, 7}};
        int[][] arr2D2={{10,20,30},{40,50,60,70}};


        int[][][] arr3D={arr2D1,arr2D2};    // This is a 3 Dimensional Array

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[1][1]));

        System.out.println(arr3D[1][1][0]);

        System.out.println("====================================");

        int[][][][] arr4D={arr3D};

        int[][][][][] arr5D={arr4D};






    }

}