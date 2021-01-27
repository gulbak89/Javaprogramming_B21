package day21_whileLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int result=0;

       for(int i=0; i<1; ) {

           System.out.println("Enter a number");
           int num= scan.nextInt();
           if(num<0){
               break;
           }else {

               result += num;    // the result never gonna be include the negative number
           }




       }
       scan.close();
        System.out.println("sum= "+result);

    }
}
