package day20_forLoop;

import java.util.Scanner;

public class WarmUp {


    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        for(char chr=97; chr<=122; chr++){
            System.out.print(chr+" ");
        }
        System.out.println();

        for(char ch='A'; ch<='Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println();

        for(char chr=122; chr>=97; chr--){
            System.out.print(chr+" ");
        }
        System.out.println();

        for(int i=90; i>=65; i--){
            System.out.print((char)i+" ");

        }




    }
}
