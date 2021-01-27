package day22;

import java.util.Scanner;

public class FindTheMaxAndMin {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int max=-99999999;
        int min=999999999;

        for(int i=1; i<=5; i++){
            System.out.println("Enter a number");
            int n=scan.nextInt();

            if(n>max){
                max=n;
            }else if(n<min){      // instead of if-else, we can also use two single if statement
                min=n;
            }

        }


        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }
}
