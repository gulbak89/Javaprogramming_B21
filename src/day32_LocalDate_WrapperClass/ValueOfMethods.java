package day32_LocalDate_WrapperClass;

public class ValueOfMethods {
    public static void main(String[] args) {
        String s1="123";
        int num1=Integer.valueOf(s1);   // returns wrapper class value
        // primitive<== wrapper class     so it is unboxing

        Integer num2=Integer.valueOf(s1);  // not autoboxing nor unboxing
        //wrapper class <== wrapper class

        System.out.println(num2+2);

        String s2="2.5";
        double d1=Double.valueOf(s2);  // unboxing

        Double d2=Double.valueOf(s2);

        System.out.println(d1);

        String s3="true";
        boolean b1=Boolean.valueOf(s3); // unboxing

        Boolean b2=Boolean.valueOf(s3);

        System.out.println(!b2);

        System.out.println(num2.MAX_VALUE);
    }
}
