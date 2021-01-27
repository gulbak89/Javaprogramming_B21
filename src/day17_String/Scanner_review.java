package day17_String;
import java.util.Scanner;
public class Scanner_review {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // make the Scanner object

        System.out.println("pick a number from 1 to 10");
        byte num = input.nextByte(); // accept one byte value

        if (num > 0 && num < 11) {      // make sure the number is in the range
            System.out.println("Can you enter the number as a word");
            String word = input.next();  // accept one word

            boolean arematching = false;   // why we put "false" here??????
            switch (word) {

                case "one":
                    arematching = num == 1;
                    break;
                case "two":
                    arematching = num == 2;
                    break;
                case "three":
                    arematching = num == 3;
                    break;
                case "four":
                    arematching = num == 4;
                    break;
                case "five":
                    arematching = num == 5;
                    break;
                case "six":
                    arematching = num == 6;
                    break;
                case "seven":
                    arematching = num == 7;
                    break;
                case "eight":
                    arematching = num == 8;
                    break;
                case "nine":
                    arematching = num == 9;
                    break;
                case "ten":
                    arematching = num == 10;
                    break;
                default:

            }


                    if (arematching) {
                        System.out.println("Your number is: " + num);
                        System.out.println("Word: " + word);
                    } else {
                        System.err.println("word is not matching");
                    }

            }else{
                System.err.println("It is not betwwen 1 to 10");
            }


        }
    }

