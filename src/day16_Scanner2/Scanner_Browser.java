package day16_Scanner2;
import java.util.Scanner;

public class Scanner_Browser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Browser");
        String browser = input.nextLine();

       switch(browser){
           case"chrome":
           case"CHROME":
               System.out.println("chrome is opening");
               break;
           case"firefox"  :
           case"FIREFOX":
               System.out.println("fire fox is opening");
               break;

           case"safari":
           case"SAFARI" :
               System.out.println("safari is opening");
               break;

           case"opera":
           case"OPERA":
               System.out.println("opera is opening");
               break;
           default:
               System.out.println("invalid browser");
       }



        }


    }

