package day31;

import java.util.Arrays;

public class MethodOverlodeing_intro {

    public static void method(){

        System.out.println("A");

    }

    public static void method(int a){
        System.out.println("B");

    }

    public static void method(int a, int b){
        System.out.println("C");

    }

    public static void method(String a){
        System.out.println("D");
    }

    public static void method(double a){
        System.out.println("E");
    }

    public static void main(String[] args) {

        method();
        method(2);
        method(3,5);
        method("hello");
        method(4.6);


        int[] arr1={1,2,3,4,5};
        double[] arr2={2.0,4.3,1.5,0};
        String[] arr3={"A","D","B","C"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));

    }

}
