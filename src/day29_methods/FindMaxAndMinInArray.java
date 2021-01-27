package day29_methods;

import java.util.Arrays;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {

        int[] a1={100,-200,40,56,100,53};


    ArrayMaxNumber(a1);
    ArrayMaxNumber2(a1);

    ArrayMinNumber(a1);
    ArrayMinNumber2(a1);



    }

    public static void ArrayMaxNumber(int[] num){


        Arrays.sort(num);

        System.out.println("Max is: "+num[num.length-1]);
    }


    public static void ArrayMaxNumber2(int num2[]){
        int max=num2[0];
        for (int each:num2){
            if(each>num2[0]){
                max=each;
            }
        }

        System.out.println("Max is: "+max);
    }


    public static void ArrayMinNumber(int[] Num){

        Arrays.sort(Num);
        System.out.println("Min is: "+Num[0]);
    }


    public static void ArrayMinNumber2(int[] Num2){
        int min=Num2[0];
        for (int each2: Num2){

            if(each2<Num2[0]){
                min=each2;
            }
        }

        System.out.println("Min is: "+min);
    }



}
