package day16_Scanner2;
import java.util.Scanner;
import java.util.Scanner;
public class Scanner_nextLine2 {
    public static void main(String[] args) {

        Scanner string = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = string.nextInt();

        System.out.println("Enter your phone number");
        long phone = string.nextLong();

        string.nextLine();  // We put this here in order to let it  accept the ENTER

        System.out.println("Enter your full name");
        String fullName = string.nextLine();

        System.out.println("================================");

        System.out.println("Name: "+fullName);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+phone);


    }
}
