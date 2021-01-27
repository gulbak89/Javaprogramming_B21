package day25_ArrayIntro;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String[] month={"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};

        System.out.println("Enter the number of the month:");
        int number=scan.nextInt();

        System.out.println(month[number-1]);


        String[] week={"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("Enter the number of the week:");
        int number2=scan.nextInt();

        System.out.println(week[number2-1]);


    }
}
