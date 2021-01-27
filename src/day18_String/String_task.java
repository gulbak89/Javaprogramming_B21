package day18_String;

import java.util.Scanner;

public class String_task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter apple and banana");

        String a=scan.nextLine();
        String b=scan.nextLine();

        System.out.println("============================");

        System.out.println(a.substring(1,a.length()-1+1)+b.substring(1,b.length()-1+1));
                          //subtract second letter to last letter of first and second word


        System.out.println("=========================");



    }


}
