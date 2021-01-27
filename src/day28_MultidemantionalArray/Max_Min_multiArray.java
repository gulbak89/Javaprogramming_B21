package day28_MultidemantionalArray;

public class Max_Min_multiArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6};
        int[] c = {7, 8, 9};

        int[][] arr2D = {a, b, c};

        int max = arr2D[0][0];
        int min = arr2D[0][0];

        for (int i = 0; i < arr2D.length; i++) {

            for (int j = 0; j < arr2D[i].length; j++) {

                if (arr2D[i][j] > max) {
                    max = arr2D[i][j];
                }

                if (arr2D[i][j] < min) {
                    min = arr2D[i][j];

                }
            }
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println("==================================================");

        for (int[] each1 : arr2D) {
            for (int each2 : each1){

                if(each2>max){
                    max=each2;
                }

                if(each2<min){
                    min=each2;
                }
            }


        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
