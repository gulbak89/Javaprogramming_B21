package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimepractice1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth year, month and day");
        LocalDate dob1=LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());

        System.out.println("Enter second person birth year, month and day");
        LocalDate dob2=LocalDate.of(scan.nextInt(),scan.nextInt(),scan.nextInt());

        if(dob1.isBefore(dob2)){
            System.out.println("You are older");
        }else if(dob1.isEqual(dob2)){
            System.out.println("You two are at the same age");

        } else{
            System.out.println("Next person is older");
        }

        scan.close();

        int age1=LocalDate.now().getYear()-dob1.getYear();
        int age2=LocalDate.now().getYear()-dob2.getYear();

        System.out.println("You are going to be "+(age1+30)+" the next person going to be "+(age2+30)+" year-old");


        LocalDate Dob=LocalDate.of(1989,11,19);
        int age=calculateAge(Dob,30);
        System.out.println(age);

        System.out.println("======================================");

        int Age=LocalDate.now().getYear()-Dob.getYear();
        int years10Ago=age-10;    // age of the person ten years ago
        System.out.println(years10Ago);

        System.out.println("======================================");

        LocalDate DateOfbirth=LocalDate.of(2010,11,19);
        int currentAge=LocalDate.now().getYear()-DateOfbirth.getYear();
        LocalDate eligibel=LocalDate.of(LocalDate.now().plusYears(21-currentAge).getYear(), DateOfbirth.getMonth(), DateOfbirth.getDayOfMonth());

        DateTimeFormatter df= DateTimeFormatter.ofPattern("MMMM/dd/yyyy, EEEE ");

        if(currentAge>=21){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("You will be eligible to buy alcohol from "+eligibel.format(df));
        }
    }

    public static int calculateAge(LocalDate DoB, int year ){
        int age=LocalDate.now().plusYears(year).getYear()- DoB.getYear();

        return age;
    }


}
