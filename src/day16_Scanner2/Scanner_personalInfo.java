package day16_Scanner2;
import java.util.Scanner;
public class Scanner_personalInfo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName= input.nextLine();

        System.out.println("Enter your last name");
        String lastName= input.nextLine();

        System.out.println("Are you emplyoed or not? Enter 'true' or 'false'");
        boolean employed= input.nextBoolean();

        double salary= 0;

        if(employed) {
            System.out.println("What is your salary?");
            salary=input.nextDouble();
        }

        System.out.println("Enter your salary");


        System.out.println("==================================");
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Employed: "+employed);
        System.out.println("salary: $"+salary);

    }

}
