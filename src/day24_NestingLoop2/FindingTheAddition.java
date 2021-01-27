package day24_NestingLoop2;


import java.util.Scanner;

public class FindingTheAddition {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int result=0;

       while(true){
           System.out.println("Enter a numbers:");
           int n1=scan.nextInt();

           System.out.println("Enter a number");
           int n2=scan.nextInt();

           result=n1+n2;
           System.out.println("Result: "+result);

           scan.nextLine();

           System.out.println("Would you like to continue");
           String answer=scan.nextLine();

           while(!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
               System.out.println("invalid Entry, Please re=enter");
               System.out.println("Would you like to continue?");
               answer=scan.nextLine();
           }

           if(answer.equalsIgnoreCase("no")){
               break;

           }

       }

       scan.close();


    }
}
