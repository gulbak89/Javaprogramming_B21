package day25_ArrayIntro;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       while(true) {

           System.out.println("Enter your first number");
           double n1 = scan.nextDouble();

           System.out.println("Enter math operator");
           char oprt = scan.next().charAt(0);

           System.out.println("Enter second number");
           double n2 = scan.nextDouble();

           switch (oprt) {
               case '+':
                   System.out.println("Addition:" + (n1 + n2));
                   break;

               case '-':
                   System.out.println("Subtraction:" + (n1 - n2));
                   break;

               case '*':
                   System.out.println("Multiplication:" + (n1 * n2));
                   break;

               case '/':
                   System.out.println("Division:" + (n1 / n2));
                   break;

               case '%':
                   System.out.println("Remainder:" + (n1 % n2));
                   break;

               default:
                   System.out.println("invalid input");

           }

           System.out.println("Do you wanna continue?");
           String ans=scan.next().toLowerCase();

           while(!(ans.equals("yes")|| ans.equals("no"))){
               System.out.println("Invalid input, please re-enter");
               System.out.println("Do you wanna continue?");
               ans=scan.next().toLowerCase();
           }

           if(ans.equals("no")){
               break;
           }
       }



    }
}
