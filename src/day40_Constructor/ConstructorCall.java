package day40_Constructor;

public class ConstructorCall {

    public ConstructorCall(){
        System.out.println("Default constructor");

    }

    public ConstructorCall(int a ){       // constructor over loading
        //ConstructorCall();                 // Constructor only can be called in the Constructor, can not be called in the other regular methods.
        this();                           // this is how we called the constructor, using this(); keyword. and this() Constructor call must be at the first step, and only one Constructor can be called in another Constructor.
        System.out.println("Constructor with int arg ");

    }

    public ConstructorCall(String str){

        this(7);
        System.out.println("Constructor with String arg");
    }



    public void method(){

    }

    public static void method1(){

        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }

    public static void method3(){
        method1();
        method2();
        System.out.println("Method 3");
    }


    public static void main(String[] args) {

        method3();

        ConstructorCall obj1=new ConstructorCall("A");




    }
}
