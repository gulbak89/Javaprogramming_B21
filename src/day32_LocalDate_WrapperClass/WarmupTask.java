package day32_LocalDate_WrapperClass;

import java.util.Arrays;

public class WarmupTask {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int number=7;

        int[] array2=addElement(array,number);
        System.out.println(Arrays.toString(array2));

    }

    public static int[] addElement(int[] arr, int element){

        int[] arr2=new int[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=element;


        return arr2;

    }

    public static String[] addElement(String[] arr, String element){

        String[] arr2=new String[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=element;


        return arr2;

    }

    public static char[] addElement(char[] arr, char element){

        char[] arr2=new char[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=element;


        return arr2;

    }

    public static double[] addElement(double[] arr, double element){

        double[] arr2=new double[arr.length+1];

        for (int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=element;


        return arr2;

    }
}
