package day28_MultidemantionalArray;

import java.util.Arrays;

public class ArrayPractice4 {

    public static void main(String[] args) {

        String[] names={"Max","Ayshem","Jon","Polat","Erkin"};
        int[] salary={9000,12000,12000,10000,9000};

        int max=salary[0];
        for (int each: salary){
            if(each>max){
                max=each;
            }
        }

        System.out.println(max);

        for(int i=0; i<names.length; i++){
            if(max==salary[i]){

                System.out.println(names[i]);
            }



        }








    }
}
