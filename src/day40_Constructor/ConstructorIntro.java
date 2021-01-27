package day40_Constructor;


public class ConstructorIntro {


    static int b;

    static{

        System.out.println("Static block");
        b=200;
    }

    public ConstructorIntro(int a ){

        System.out.println("Constructor with int argument");
        this.a=a;
    }

    int a=100;    // instance variable

    public static void main(String[] args) {

       // System.out.println(a);    // instance variable can not be called in main method, cause main method is static

       int num=new ConstructorIntro(10).a;
       ConstructorIntro obj2=new ConstructorIntro(20);












    }
}
