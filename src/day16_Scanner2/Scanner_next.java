package day16_Scanner2;
import java.util.Scanner;
public class Scanner_next {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName= input.next();


        System.out.println("Enter your Last Name");
        String lastName= input.next();
        System.out.println("============================");

        System.out.println("Your full name is: ");
        System.out.println(firstName+" "+lastName);





    }
}
