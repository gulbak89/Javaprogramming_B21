package day45_Excaption;

import offineHours.Practice_11_26.Scanner;

public class ThrowKeyWord {

    public static void main(String[] args) {

        java.util.Scanner scan=new java.util.Scanner(System.in);

        int age=scan.nextInt();

        if(age<0 ||age>150){
            throw new RuntimeException("Invalid age number entered");  //create a exception using "throw" key word
        }

        if(age>=21){
            System.out.println("Eligible");

        }else{
            System.out.println("Not eligible");
        }

        scan.close();






    }
}
