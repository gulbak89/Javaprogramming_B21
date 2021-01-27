package day41_Encapsulation;

public class Data {

    public static String publicVariable="A";
    private static String privateVariable="B";
    static String defaultVariable="C"; // default access modifier: only reachable in the same package.

    protected static String protectedVaribale="D"; //protected access modifier:


     Data(){      //default access modifier for the constructor, it can be called in the same package

    }

    public static void publicMethod(){
        System.out.println("public method");
    }

    private static void privateMethod(){
        System.out.println("private method");
    }

    static void defaultMethod(){
        System.out.println("default method");
    }


}
