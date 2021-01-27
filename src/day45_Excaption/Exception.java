package day45_Excaption;

public class Exception {

    public static void main(String[] args) {

       //StringIndexOutOfBoundException


       String str="hello" ;


       //handle the exception
       try {

           System.out.println(str.substring(10, 20));

       } catch (StringIndexOutOfBoundsException e){   // or using RunTimeException  to handle the unchecked exception, cause it is the parent of all the unchecked exceptions.

           System.out.println(e.getMessage());  // can get the message of the exception
           e.printStackTrace();      // can get the report of the exception

       }

        System.out.println("hi");  // after the handling the exception this statement can be executed, otherwise, it can not.


        try {
            Thread.sleep(2000);
            System.out.println("Try Block");   // try block gets executed cause try block handle the exception.

        }catch (InterruptedException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("catch block"); // catch block will not be executed, cause catch block didn't handle the exception.
        }

        System.out.println("wow");














    }
}
