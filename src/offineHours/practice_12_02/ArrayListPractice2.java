package offineHours.practice_12_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Character> list=new ArrayList<>(Arrays.asList('A','A','B','B','C','C','D','E','F'));
        System.out.println(list);

        list.removeAll(Arrays.asList('A'));
        System.out.println(list);

        list.retainAll(Arrays.asList('B','C'));
        System.out.println(list);


        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(p->p%2==0);
        System.out.println(list2);

        //remove() can not be used in the loop
    }
}
