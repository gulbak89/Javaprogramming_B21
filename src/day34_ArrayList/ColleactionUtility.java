package day34_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ColleactionUtility {

    public static void main(String[] args) {

        ArrayList<Character> list=new ArrayList<>();

        list.add('C');
        list.add('F');
        list.add('P');
        list.add('B');
        list.add('X');
        list.add('M');

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(1);
        list1.add(3);
        list1.add(9);
        list1.add(9);

        System.out.println(list1);

        Collections.sort(list1);

        System.out.println(list1);

        System.out.println("max: "+ list1.get(list1.size()-1));
        System.out.println("min: "+list1.get(0));
        System.out.println(Collections.max(list1));

        Collections.swap(list1,0,list1.size()-1);

        System.out.println(list1);

        Collections.swap(list1,list1.indexOf(4),list1.indexOf(5));
        System.out.println(list1);

        System.out.println("=============================");

        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');
        chars.add('A');

        Collections.replaceAll(chars,'A','a');
        System.out.println(chars);

        int frequency= Collections.frequency(chars,'a');
        System.out.println(frequency);






    }
}
