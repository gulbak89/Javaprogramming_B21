package day19_loop;

import java.util.Scanner;

public class Compare3Words {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 3 word");
        String w1=scan.nextLine();
        String w2=scan.nextLine();
        String w3=scan.nextLine();

        int l1= w1.length();
        int l2= w2.length();
        int l3=w3.length();

        if(l1==l2 && l1==l3){
            System.out.println("all are same length");
        }else if(l1==l2 || l1==l3 || l2==l3){
            System.out.println("not same nor different length");
        }else{
            System.out.println("all of them different");
        }

    }
}
