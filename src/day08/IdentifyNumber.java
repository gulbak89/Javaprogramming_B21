package day08;

public class IdentifyNumber {

    public static void main(String[] args) {

        int a = 100;
        boolean isPositive = a > 0;
        boolean isNegative = a < 0;
        boolean isZoro = a == 0;
        System.out.println(a+" is positive number is "+ isPositive);
        System.out.println(a+" is a negative number is "+ isNegative);
        System.out.println(a+" is equal to 0 is "+ isZoro);


    }
}


/*

number = 100;
output:

100 is positive number is true.
100 is negative number is false.
100 is 0 is false.

 */