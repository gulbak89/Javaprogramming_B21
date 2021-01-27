package day26_arrays;

import java.util.Arrays;

public class EvenAndOddNumber {

    public static void main(String[] args) {

        int[] num=new int[100];

        for(int i=0; i<num.length; i++){
            num[i]=i+1;

        }

        System.out.println(Arrays.toString(num));

        int countEven=0;
        int countOdd=0;
        int countDivisibleyBy3=0;

        for(int i=0; i<=num.length-1; i++){
            int eachNumber=num[i];
            if(eachNumber%2==0){
                countEven++;
            }else{
                countOdd++;
            }

            if(eachNumber%3==0){
                countDivisibleyBy3++;
            }
        }
        System.out.println("Total even numbers "+countEven);
        System.out.println("total odd numbers: "+countOdd);
        System.out.println("Total numbers can be evenly divisible by 3 is: "+countDivisibleyBy3);




        System.out.println("========================================");

        int[] num2=new int[100];
        for(int i=0; i<num2.length; i++){
            num2[i]=i+100;
        }

        System.out.println(Arrays.toString(num2));
    }


}
