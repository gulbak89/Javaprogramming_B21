package day29_methods;

import java.util.Scanner;

public class FindUniqueFromArrayMethod {

    public static void main(String[] args) {
        int[] num={3,4,2,3,4,5};
        FindUniqFromArray(num);

        SumOf3Num(16,34,67);

        System.out.println("========================================");


        //Scanner scan=new Scanner(System.in);
       // SumOf3Num(scan.nextInt(),scan.nextInt(),scan.nextInt());
        //scan.close();

        GreaterBetween2(23,24);



    }

    public static void FindUniqFromArray(int[] arr1){

        for (int each:arr1){
        int count=0;
        for (int each2:arr1){
            if(each==each2){
                count++;
            }

        }
        if(count==1){
            System.out.println(each);
        }

        }

    }

    public static void SumOf3Num(int n1, int n2, int n3){

        System.out.println("Sum is: "+(n1+n2+n3));

    }

    public static void GreaterBetween2(int n1, int n2){
        if(n1>n2){
            System.out.println(n1+" is greater");
        }else if(n2>n1){
            System.out.println(n2+" is greater");
        }else{
            System.out.println("both are equal");
        }
    }


}
