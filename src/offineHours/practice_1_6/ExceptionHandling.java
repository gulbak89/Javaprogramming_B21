package offineHours.practice_1_6;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

public class ExceptionHandling {

    public static void main(String[] args) throws InterruptedException {
        try {
            throw new NoSuchElementException("Element not found");
        }catch (NoSuchElementException e){
            System.out.println("Exception message: "+e.getMessage());
            e.printStackTrace();

        }

        System.out.println("Test1 ended");

        String str="hello";
        try {
            System.out.println(str.charAt(10));  // unchecked exception, handled by try and catch block
        }catch (IndexOutOfBoundsException e){
            System.out.println("Exception message: "+e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test2 ended");


        try {
            Thread.sleep(3000);   //checked exception. We can also use "throws" key word to handle the exception.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            throw new FileNotFoundException();   // created a checked exception using "throw" key word, and handled by using try and catch block
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("========================================");

        Thread.sleep(3000);  // checked exception handled by using "throws" key word in the method signature.




    }
}
