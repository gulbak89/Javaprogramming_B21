package day45_Excaption;

public class ExceptionIntro {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5};

        //System.out.println(array[10]);  // unexpected event==> unchecked(unexpected exception ) exception ==> run time

        System.out.println("Test completed");  // can not be executed because of the unexpected event above

        //Thread.sleep(2000);   //unwanted==>checked exception  ==>compile time

        System.out.println(10/0);  // unexpected exception





    }
}
