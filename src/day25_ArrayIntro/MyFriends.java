package day25_ArrayIntro;

import java.util.Scanner;

public class MyFriends {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("How many friends you have?");

        int number=scan.nextInt();

        String[] firstName=new String[number];
        String[] lastName=new String[number];

        for(int i=0; i<number; i++){ //
            System.out.println("Enter first name:");
           firstName[i] =scan.next();
           firstName[i]=firstName[i].substring(0,1).toUpperCase()+firstName[i].substring(1).toLowerCase();

            System.out.println("Enter last name:");
            lastName[i]=scan.next();
            lastName[i]=lastName[i].substring(0,1).toUpperCase()+lastName[i].substring(1).toLowerCase();
        }

        for(int i=0; i<number; i++){ //used for print out element in the arrays
            System.out.println(firstName[i]+" "+lastName[i]);
        }

    }
}
