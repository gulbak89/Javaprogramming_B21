package library;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {


    public static int max(int[] arr){

        int max=arr[0];

        for (int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }
    /*
    returns the max number from a Array of integer
     */


    public static int min(int[] arr){
        int min=arr[0];
        for (int each: arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    /*
    returns the min number from a Array of integer
     */

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

    /*
    combines two integer Arrays
     */


    public static int[] sortDescending(int[] arr){

        Arrays.sort(arr);

        int[] arr2=new int[arr.length];

        for (int i=arr.length-1; i>=0; i--){
            for(int j=0; j<=arr.length-1; j++){
                arr2[j]=arr[i];
            }
        }

        return arr2;
    }
    /*
    Sorts the int Array in a descending order
     */


    public static String printArray(int[] arr){

        String str=Arrays.toString(arr);
        str=str.replace("[","{").replace("]","}");

        return str;
    }

    /*
    print out the arrays in {}


     */

    public static double min(double[] arr){
        double min=arr[0];

        for (double each:arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }


    public static double max(double[] arr){
        double max=arr[0];

        for (double each:arr){
            if(each>max){
                max=each;
            }
        }
        return max;
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

    public static int[] reversedArray(int[] arr){

        int[] reversed = new int[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }
        return reversed;


    }

    public static char[] reversedArray(char[] arr){

        char[] reversed = new char[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }
        return reversed;


    }

    public static String[] reversedArray(String[] arr){

        String[] reversed = new String[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }
        return reversed;


    }

    public static double[] reversedArray(double[] arr){

        double[] reversed = new double[arr.length];

        for (int i=arr.length-1,  j=0; i>=0; i--, j++){
            reversed[j]=arr[i];



        }
        return reversed;


    }

    public static String[] Unique(String[] arr){

        ArrayList<String> list=new ArrayList<>();

        for (String each: arr){

            int count=0;

            for (String each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        String[] unique=new String[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static int[] Unique(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();

        for (Integer each: arr){

            int count=0;

            for (Integer each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        int[] unique=new int[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static char[] Unique(char[] arr){

        ArrayList<Character> list=new ArrayList<>();

        for (Character each: arr){

            int count=0;

            for (Character each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        char[] unique=new char[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static double[] Unique(double[] arr){

        ArrayList<Double> list=new ArrayList<>();

        for (Double each: arr){

            int count=0;

            for (Double each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        double[] unique=new double[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }




}








