package day17_String;
import java.util.*;
public class String_task {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three letter word ");
        String word= input.next();

        if(word.length()==3) {
            if (word.charAt(1) == 'a') {
                System.out.println("cool word");

            } else {
                System.out.println("Okay word");
            }

        }else{
            if(word.length()<3) {
                System.err.println("word is too short!");
            }else{
                System.err.println("word is too long!");
            }
        }
    }
}
