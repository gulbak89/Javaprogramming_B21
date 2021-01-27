package day30_returnMethod;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {

        PositiveOrNegative(0);

        System.out.println("===============");

        int[] numbers={1,2,3,-5,6,11};

        for (int each:numbers){
            PositiveOrNegative(each);
        }
        System.out.println("===================");

        calculateGrade(100);

        System.out.println("=========================");

        int[] n1={1,2,3,4,5};
        int[] n2={6,7,8,9,10};
        combine2Arrays(n1,n2);
        System.out.println("========================");

        String words="abdfjslasdkfjladkj";
        RemoveDuplicatedCharacters(words);
        removeDuplicateChar(words);

        System.out.println("=============================");

        PrintFullName("angilina","jullie");









    }

    public static void PositiveOrNegative(int n1){

        if(n1>0){
            System.out.println(n1+" is positive");
        }else if(n1<0){
            System.out.println(n1+" is negative");
        }else{
            System.out.println(n1+" is zero");
        }
    }

    public static void calculateGrade(int score){

        if(score>=0 && score<=100){
            char grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';

            System.out.println(grade);



        }else{
            System.out.println("Invalid score");
        }


    }


    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3=new int[arr1.length+arr2.length];

        int i=0;
        for (int each:arr1){
            arr3[i]=each;
            i++;

        }

        for (int each: arr2){
            arr3[i]=each;
            i++;
        }

        System.out.println(Arrays.toString(arr3));


    }

    public static void RemoveDuplicatedCharacters(String str){

        String result="";

        for (int i=0; i<str.length(); i++){
            char eachar=str.charAt(i);

            if(result.contains(eachar+"")){
                continue;

            }else{
                result+=eachar+"";
            }
        }

        System.out.println(result);
    }

    public static void removeDuplicateChar(String str){
        String result="";
        for (String each: str.split("")){
            if(result.contains(each)){
                continue;
            }else{
                result+=each;
            }
        }
        System.out.println(result);
    }

    public static void PrintFullName(String firstName, String lastName){
        String fullName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase()+" "
                +lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        System.out.println(fullName);

    }


}
