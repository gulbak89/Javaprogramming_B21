package day16_Scanner2;
import java.util.Scanner;
public class Warmup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        System.out.println("How many hours you work in a week?");
        int hour = scan.nextInt();
        System.out.println("====================================");

        double hourlyRate = salary/(hour*52);

        System.out.println("your hourly rate is: ");
        System.out.println( hourlyRate);



    }
}
