package day16_Scanner2;
import java.util.Scanner;

public class Scanner_calculater {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        double num1 = input.nextDouble();

        System.out.println("Enter another number");
        double num2 = input.nextDouble();

        System.out.println("Enter the operator");
        String operator = input.next();  //accepting the operator


        input.close();

        double value = 0;
        boolean isValid = true;

        switch (operator) {
            case "+":
            case"addition":
            case"plus" :
                value = num1 + num2;
                break;
            case "-":
            case"subtraction":
            case"minus":
                value = num1 - num2;
                break;
            case "/":
            case"division":
            case"divide":
                value = num1 / num2;
                break;
            case "*":
            case"x" :
            case"multiply":
                value = num1 * num2;
                break;
            case "%":
            case"remainder":
                value = num1 % num2;
                break;

            default:

                isValid = false;


        }

        if (isValid) {


            System.out.println(num1 + " " + operator + " " + num2 + " = " + value);


        }else
            System.out.println(operator+" is invalid operator");
    }
}
