package day07_UnaryOperator;

public class PrimitiveCasting {

    public static void main(String[] args) {

        short a = 3000;
        double b = a;  //casting smaller to larger type can be done automatically by the compiler, it can't be done automatically vice versa.
                       // which is called Implicit Casting

        double d1 = 500.5;
        int i1 = (int)d1; // Explicit Casting, larger type can be assign to smaller type  manually, but not automatically.

        long l1 = 100;
        short s1 = (short)l1; //explicit casting.

        double d2 = 300;
        float f2 = (float) d2;  //short cut for explicit casting: OPTION(ALT) + ENTER

        short s2 = 400;
        byte b2 = (byte) s2;  // cannot change the limit of the data type. -128 = < byte = < 127, 400 is out of range of byte.


        System.out.println(b);
        System.out.println(i1);
        System.out.println(s1);
        System.out.println(f2);
        System.out.println(b2);







    }
}
