package day20_forLoop;

import java.util.Scanner;

public class BreakContinue {

    public static void main(String[] args) {

        for(int i=1; i<=10; i-- ){

            if(i<1){
                break;
            }

            System.out.println("hi");


        }


        System.out.println("===========================");
        Scanner scan=new Scanner(System.in);

        for(int i=0; i==0;){

        System.out.println("enter 2 number");

        int n1=scan.nextInt();
        int n2=scan.nextInt();

        System.out.println("Sum is: "+(n1+n2));
        scan.nextLine();
        System.out.println("do you want to continue");
        String answer=scan.nextLine();

        if(answer.equalsIgnoreCase("no")){
            System.out.println("Thank you for using our calculator");
            break;
        }

        }

        System.out.println("===============");

        for(int i=0; i==0;){

            System.out.println("enter 2 number");

            int n1=scan.nextInt();
            int n2=scan.nextInt();

            System.out.println("Enter math operator");
            char op=scan.next().charAt(0);

            switch(op){
                case '+':
                    System.out.println(n1+n2);
                    break;
                case'-':
                    System.out.println(n1-n2);
                    break;
                case'/':
                    System.out.println(n1/n2);
                    break;
                case'*':
                    System.out.println(n1*n2);
                    break;
                case'%':
                    System.out.println(n1%n2);
                    break;

                default:
                    System.out.println("Invalid operator");
            }


            scan.nextLine();
            System.out.println("do you want to continue");
            String answer=scan.nextLine();

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for using our calculator");
                break;
            }



        }
        scan.close();
    }
}

/*

ask user to enter 2 numbers and then print the sum of those 2 numbers,

 */
