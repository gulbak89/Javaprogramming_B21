package offineHours.practice_10_21;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter our gender:");
        String gender=scan.nextLine();

        System.out.println("Enter you age:");
        int age=scan.nextInt();

        System.out.println("Enter your full name");
        scan.nextLine();
        String fullName=scan.nextLine();

        System.out.println("Enter you zip code:");
        int zip=scan.nextInt();

        System.out.println("Enter you country name:");
        scan.nextLine();
        String country=scan.nextLine();

        System.out.println("Enter your salary:");
        double salary=scan.nextDouble();

        System.out.println("Enter your company name:");
        scan.nextLine();
        String company=scan.nextLine();

        System.out.println("Enter your address:");
        scan.nextLine();
        String address=scan.nextLine();
        scan.close();

    }
}
