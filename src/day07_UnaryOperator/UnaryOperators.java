package day07_UnaryOperator;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 100;
        boolean aIsPositive = a > 0;
        boolean aIsNegative = a < 0;

        int b = -100;
        boolean bIsPositive = b > 0;
        boolean bIsNegative = b < 0;

        int c = 10 - - 20;

        int x = 100;
        ++x;                        // increase the value by one ==> Increment "++"

        int y = 100;
        --y;                       //  decrease the value by one ==> Decrement "--"


        int z = 100;

        int g = 100;
               // post decrement, first passed the current value, then decreases  the value by 1 => g --, see the out print command





        System.out.println();

        System.out.println(a+" is positive is " +aIsPositive);
        System.out.println(a+" is negative is "+ aIsNegative);
        System.out.println();

        System.out.println(b+" is positive is " +bIsPositive);
        System.out.println(b+" is positive is " +bIsNegative);
        System.out.println();

        System.out.println(c);
        System.out.println();

        System.out.println(x);
        System.out.println(y);
        System.out.println(--z);

        System.out.println();

        System.out.println(g--);
        System.out.println(g);


    }
}
