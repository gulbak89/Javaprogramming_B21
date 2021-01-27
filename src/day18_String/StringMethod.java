package day18_String;
import java.util.Scanner;
public class StringMethod {
    public static void main(String[] args) {

        String str= "cybertek";
        String str2 = str.concat(" School"); //concat() only concat String to the String.

        System.out.println(str);
        System.out.println(str2);

        System.out.println("=====================================");

        String name="bank of america";
        System.out.println(name.toUpperCase());

        String name2="BABY";
        System.out.println(name2.toLowerCase());

        System.out.println("=======================================");

        String s1="      Hello, world";
        System.out.println(s1);
        System.out.println(s1.trim()); // trim() method removes the spaces that are not used (unnecessary spaces)in the String

        System.out.println("========================================");

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName=scan.nextLine();

        System.out.println("Enter you last name");
        String lastName=scan.nextLine();


        System.out.println("First name is: "+ firstName);
        System.out.println("First name is: "+firstName.trim());

        System.out.println(lastName);
        System.out.println(lastName.trim());












    }
}
