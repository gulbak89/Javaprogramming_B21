package day17_String;

import java.util.*;
import java.util.*;

public class travelTask {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double cost=0;

        System.out.println("Do you have a valid passport?");
        String validPassport= input.next();

        if(validPassport.equalsIgnoreCase("yes")) {

          cost=1000;

            System.out.println("Which country do you wanna go to?");
            input.nextLine();
            String country = input.nextLine();

            System.out.println("How many bags are you going to take?");
            byte bags= input.nextByte();
            cost+=(bags*50);

            System.out.println("How many people are you going to travel with?");
            short people= input.nextShort();
            if(people>=3) {
                cost-=300;
            }else{
                cost-=(people*100);
            }

            System.out.println("Enter the name of the people you will travel with");
            input.nextLine();   // absorb the ENTER from above method
            String names= input.nextLine();




            System.out.println("Your ticket is booked to "+ country+". We have charged extra for the "+bags+" bags but you are traveliing with " +
                    people+" people, "+names+", so we are giving you a discount. Your total cost is: &"+ cost);








        }else{
            System.out.println("Sorry, You can not travel without a valid passport");



        }






    }
}
