package day32_LocalDate_WrapperClass;

public class WrapperClassIntro {

    public static void main(String[] args) {

        byte b=100;
        Byte b2=b;   // Wrapper Class  byte

        Integer b3=(int) b;   // Wrapper Class integer

        int i =10;
       // Byte b3=i;  //It gives error, because  Wrapper class is only dedicated to its own primitive.

        Integer I=20;
        double d=I;

        Integer num= 100;
        long l2=num;   // primitives accept anything from wrapper class

        System.out.println("==============================");
        Character ch='A';
        char ch2=ch; // unboxing process

        int n= ch;  // unboxing process

        long score= 100;
        Long l= score; // unboxing
        Long l3=l;



    }
}
