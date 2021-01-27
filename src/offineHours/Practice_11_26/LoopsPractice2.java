package offineHours.Practice_11_26;
import java.util.Scanner;
public class LoopsPractice2 {

    public static void main(String[] args) {

       /*
       salary calculator:
       hourlyRate
       weeklyHour
       taxRates:30%

        */

       Scanner scan=new Scanner(System.in);
       double hourlyRate=0;
       int weeklyHour=0;
       String answer="";

       while(!answer.equalsIgnoreCase("no")) {

           System.out.println("Enter your hourly rate");
           hourlyRate = scan.nextDouble();

           System.out.println("How many hours do your work in a week?");
           weeklyHour = scan.nextInt();

           double salaray = weeklyHour * hourlyRate * 52;
           System.out.println("Salary: " + salaray);

           double tax = salaray * 0.3;
           System.out.println("Your tax: " + tax);

           double salaryAfterTax = salaray - tax;
           System.out.println("Your salary after tax: " + salaryAfterTax);

           System.out.println("would you like to continue?");
           answer = scan.next();

           while(!((answer.equalsIgnoreCase("yes"))|| answer.equalsIgnoreCase("no"))){
               System.out.println("Invalid input");
               System.out.println("Would you like to continue?");
               answer=scan.next();
           }
       }










    }
}
