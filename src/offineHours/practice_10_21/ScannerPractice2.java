package offineHours.practice_10_21;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the price:");
        double price=scan.nextDouble();

        System.out.println("Enter the name of the item:");
        String item=scan.nextLine();

        System.out.println("Enter your full name:");
        scan.nextLine();
        String fullName=scan.nextLine();








        System.out.println("$"+price);

        scan.close();


    }
}
