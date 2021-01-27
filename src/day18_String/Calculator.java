package day18_String;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number: ");

        double num = scan.nextDouble();

        System.out.println("Enter math operator");
        char operator= scan.next().charAt(0);

        System.out.println("Enter another number: ");
        double num2= scan.nextDouble();

        boolean isValidOperator= operator=='*'|| operator=='/' ||operator=='%' ||operator=='-'||operator=='+';
        double result=0;

        if(isValidOperator){
            if(operator=='*'){
                System.out.println("Multiplication: "+ (num*num2));
            }else if(operator=='/'){
                System.out.println("Division: "+(num/num2));
            }else if(operator=='%'){
                System.out.println("Remainder: "+(num%num2));
            }else if(operator=='+'){
                System.out.println("Addition: "+(num+num2));
            }else{
                System.out.println("Subtraction: "+(num-num2));
            }


        }else{
            System.err.println("Invalid operator is entered");
        }



    }
}
