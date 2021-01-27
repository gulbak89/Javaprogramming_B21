package day03_javaProgramming;

public class RightRectangle {

    public static void main(String[] args) {
        int score = 85; // data declearation

        System.out.println(score);
        System.out.println("score");
        System.out.println();
        System.out.println("=====================");
        System.out.println();
        long number1 = 999999999;
        System.out.println(number1);

        long number0 = 9999999999l;  // int is preferred, compiler take it as an int, and the number is out of the range of int, so add l
        System.out.println(number0);
        System.out.println();
        System.out.println("========================");

        double x = 0.5;
        System.out.println(x);

        float y = 0.5f; // double is preferred , compiler take it as a double, and the number is out of the range of double, so add f
        System.out.println(y);



    }
}
/*
for integer always use "int", because it is preferred by the compiler.
for decimal always use "double", because it is preferred by the compiler.
Double >float >long >int >short >byte
 */
