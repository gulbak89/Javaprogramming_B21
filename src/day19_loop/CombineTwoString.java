package day19_loop;

import java.util.Scanner;

public class CombineTwoString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two words");

        String w1 = scan.nextLine();
        String w2 = scan.nextLine();

        if (w1.substring(w1.length() - 1).equalsIgnoreCase(w2.substring(0, 1))) {

            System.out.println(w1+w2.substring(1));

        }else{
            System.out.println(w1+w2);
        }

        System.out.println("===================");

        if(w1.endsWith(""+w2.charAt(0))){     // endWith is a string method, so can not recognize charAt, so we add " " to make char to a string
            System.out.println(w1+w2.substring(1));
        }else{
            System.out.println(w1+w2);
        }
        System.out.println("==================================");

        if(w1.endsWith(w2.substring(0,1))){
            System.out.println(w1+w2.substring(1));
        }else{
            System.out.println(w1+w2);

        }

        scan.close();
    }
}
