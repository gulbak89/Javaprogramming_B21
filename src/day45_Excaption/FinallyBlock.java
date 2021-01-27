package day45_Excaption;

public class FinallyBlock {
    public static void main(String[] args) {

       try{
               System.out.println("hello world");

       }catch (RuntimeException e){
           System.out.println("Catch block");

       }finally {                  //finally block is not mandatory. it is not responsible for handling the exceptions. always gets executed regardless of the exception.

           System.out.println("Finally: Closed");
       }

        System.out.println("Test completed");










    }
}
