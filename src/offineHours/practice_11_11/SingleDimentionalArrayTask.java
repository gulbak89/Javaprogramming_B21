package offineHours.practice_11_11;

import java.util.Arrays;


public class SingleDimentionalArrayTask {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        for (int j = 0; j < arr1.length; j++) {

            int element = arr1[j];


            for (int i = 0; i < arr2.length; i++) {
                if (element == arr2[i]) {
                    System.out.println(element);
                }

            }


        }

        System.out.println("===============================");


        for (int each: arr1){

            for (int each2:arr2){
                if(each==each2){
                    System.out.println(each);
                }
            }


        }

        System.out.println("===================");

        String[] word={"Anna","Level","Amir","Aghlar"};

        int count=0;

        for (String each: word){
            char firsthChar=each.toLowerCase().charAt(0);
            char lastchar=each.toLowerCase().charAt(each.length()-1);

            if(firsthChar==lastchar){
                count++;
            }

        }

        System.out.println(count);



    }
}