package day19_loop;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String word=scan.nextLine();

        if(word.isEmpty()){
            System.out.println("String is empty");
        }else if(word.length()>3){
            System.out.println(word.substring(word.length()-3));
        }else{
            System.out.println(word);
        }
        scan.close();
    }
}
