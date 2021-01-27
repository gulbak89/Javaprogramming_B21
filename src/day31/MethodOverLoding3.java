package day31;

import java.util.Arrays;

public class MethodOverLoding3 {

    public static void main(String[] args) {

        int[] a1 = {2, 3, 5, 2, 5, 7, 0};
        double[] a2 = {1.3, 0, 2.9, 7.0, -2};


        System.out.println(max(a1));

        System.out.println(max(a2));

        System.out.println(min(a1));

        System.out.println(min(a2));


        int[] ar1={1,2,3,4};
        int[] ar2={5,6,7};
        int[] ar3={8,9};
        int[] ar4={10,11};

      int[] combine2=combine2Arrays(ar1,ar2);
      int[] combine3=combine2Arrays(combine2Arrays(ar1,ar2),ar3);
      int[] combine4=combine2Arrays(combine2Arrays(ar1,ar2),combine2Arrays(ar3,ar4));

        System.out.println(Arrays.toString(combine2));
        System.out.println(Arrays.toString(combine3));
        System.out.println(Arrays.toString(combine4));



    }

    public static double max(double[] arr) {
        double max = arr[0];

        for (double each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static double min(double[] arr) {
        double min = arr[0];

        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static double[] sortDescending(double[] arr){

        Arrays.sort(arr);

        double[] arr2=new double[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            for(int j=0; j<=arr.length-1; j++){
                arr2[j]=arr[i];
            }
        }

        return arr2;
    }

    public static char[] sortDescending(char[] arr){

        Arrays.sort(arr);

        char[] arr2=new char[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            for(int j=0; j<=arr.length-1; j++){
                arr2[j]=arr[i];
            }
        }

        return arr2;
    }

    public static String[] sortDescending(String[] arr){

        Arrays.sort(arr);

        String[] arr2=new String[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            for(int j=0; j<=arr.length-1; j++){
                arr2[j]=arr[i];
            }
        }

        return arr2;
    }


    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3=new double[arr1.length+arr2.length];

        int i=0;
        for (double each:arr1){
            arr3[i]=each;
            i++;

        }

        for (double each: arr2){
            arr3[i]=each;
            i++;
        }

        return arr3;


    }

    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3=new char[arr1.length+arr2.length];

        int i=0;
        for (char each:arr1){
            arr3[i]=each;
            i++;

        }

        for (char each: arr2){
            arr3[i]=each;
            i++;
        }

        return arr3;


    }


    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3=new String[arr1.length+arr2.length];

        int i=0;
        for (String each:arr1){
            arr3[i]=each;
            i++;

        }

        for (String each: arr2){
            arr3[i]=each;
            i++;
        }

        return arr3;


    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];

        int i=0;
        for (int each:arr1){
            arr3[i]=each;
            i++;

        }

        for (int each: arr2){
            arr3[i]=each;
            i++;
        }

        return arr3;


    }

}