package day24_NestingLoop2;

import java.util.Scanner;

public class ReserveRoom {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double totalPrice=0;

        System.out.println("Do you wanna reserve room");
        String answer=scan.next();

        while(answer.equalsIgnoreCase("yes")) {

            System.out.println("Which bedroom you wanna reserve?");
            String room = scan.next().toLowerCase();

            switch (room){
                case "king": totalPrice+=120;
                break;

                case "queen": totalPrice+=100;
                break;

                case "single": totalPrice+=88;
                break;

                default:

                    System.out.println("Invalid room type");
                    System.out.println("Please enter valid room type");
                    answer = scan.next();



            }
            System.out.println("Do you wanna reserve another room?");
            answer=scan.next();

            while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.out.println("Invalid room type, please re-enter");
                System.out.println("Do you want to reserve another room?");
                answer=scan.next();

            }

            if(answer.equalsIgnoreCase("no")){
                break;
            }

            }

        System.out.println(totalPrice);

        scan.close();
        }
    }


