package day17_String;
import java.util.Scanner;

public class Scanner_review2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the product name");
        String product= input.nextLine();


        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();    // let it absorb the ENTER from the above method.

        System.out.println("Enter their full name");
        String fullName= input.nextLine();

        System.out.println("=============================================================================");


        System.out.println(fullName+", your order for "+quantity+" "+product+" has been placed. Your total payment is $"+ quantity*price);










    }
}
