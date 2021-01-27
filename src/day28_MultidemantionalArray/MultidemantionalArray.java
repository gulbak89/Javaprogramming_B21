package day28_MultidemantionalArray;

import java.util.Arrays;

public class MultidemantionalArray {
    public static void main(String[] args) {

        int[] arr1={1,2};
                //  0  1
        int[] arr2={3,4,6,5,7};
               //   0 1 2 3 4

        int[] arr3={8,9,10,11,12,13};
                //  0 1  2  3  4  5     index number of elements in single array

        int[][] D2={arr1,arr2,arr3};
                 //  0    1     2      index number of each arrays in this multidimensional array

        System.out.println(D2[1][2]);
        System.out.println(D2[2][0]);

        // print entire array

        System.out.println(Arrays.deepToString(D2));  // deepToString method only used for multidimensional arrays

        System.out.println(Arrays.toString(D2[0])+Arrays.toString(D2[1])+Arrays.toString(D2[2]));

        System.out.println("=====================================================");

        String[][] groups={{"Ayshemgul","Peter","Kasimjan"},{"Max","Guzel","Baki"},{"Patigul","Rizwangul","Sayim"}};

        for(int i=0; i<=groups.length-1;i++){

            String[] eachgroup=groups[i];
            System.out.println(Arrays.toString(eachgroup));  // i represents index number of each arrays in this multidimensional array

            for(int j=0; j<eachgroup.length; j++){    // j represents index number of each elements in each single array
                String eachElement=eachgroup[j];
                System.out.println(eachElement);
            }
        }

        System.out.println("===================================");

        for (int i = groups.length-1; i>=0; i--){

            System.out.println(Arrays.toString(groups[i]));



            for(int j=groups[i].length-1; j>=0; j--){

                System.out.println(groups[i][j]);
            }
        }




    }
}
