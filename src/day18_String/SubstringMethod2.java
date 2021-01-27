package day18_String;


import java.util.Scanner;

public class SubstringMethod2 {

    public static void main(String[] args) {

        String str= "Today is Monday";
        String day= str.substring(9,str.length()); // giving both beginning and ending index to extract the word "Monday"
        String day1= str.substring(9);  // or just give the beginning index
        String day2= str.substring(str.length()-1);

        System.out.println(day);
        System.out.println(day1);
        System.out.println(day2);
        System.out.println("==================================");


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String firstName= scan.nextLine();

        System.out.println("Enter your last name");
        String lastName=scan.nextLine();

        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println("=======================================");
        System.out.println("Full name is: "+firstName+" "+lastName);




    }
}
