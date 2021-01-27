package day25_ArrayIntro;

import java.util.Scanner;

public class Roomreservation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int totalPrice= 0;

        while(true) {

            System.out.println("Which room would you like to select?");
            System.out.println("King Bed==$120");
            System.out.println("Queen Bed==$100");
            System.out.println("Single Bed==$80");
            String room = scan.nextLine().toLowerCase();

            while (!(room.equals("king bed") || room.equals("queen bed") || room.equals("single bed"))) {
                System.out.println("Invalid input, please re-enter");
                System.out.println("Which room would you like to select");
                room = scan.nextLine().toLowerCase();

            }

            totalPrice += (room.equals("king bed")) ? 120 : (room.equals("queen bed")) ? 100 : 80;

            System.out.println("Would you like to select another room?");
            String ans=scan.next().toLowerCase();
            scan.nextLine();

            while(!(ans.equals("yes")||ans.equals("no"))){
                System.out.println("Invalid input, please re-enter");
                System.out.println("would you like to select another room?");
                ans=scan.next().toLowerCase();
            }

            if(ans.equals("no")){
                System.out.println("Your total price is:"+totalPrice);
                break;
            }

        }











    }
}
