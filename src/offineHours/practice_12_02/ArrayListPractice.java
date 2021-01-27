package offineHours.practice_12_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,6));

        System.out.println(list1.isEmpty());

        int[] arr={1,2,3,4,5,6};

        for (int each: arr){
            list2.add(each);
        }

        System.out.println(list2);

        System.out.println(list2.indexOf(7)>=0);  // we can use it other than contains method to verify if 7 is contained in ArrayList or not


        System.out.println(list1.equals(list2));
        System.out.println(list1==list2);

        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(6,3,4,5,1,2));
        System.out.println(list1.equals(list3));


        Collections.sort(list1);
        Collections.sort(list3);
        System.out.println(list1.equals(list3));







    }


}
