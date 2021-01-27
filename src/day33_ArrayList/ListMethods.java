package day33_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>();

        list1.add(100);
        list1.add(200);

        list1.set(1,400);    // set method can replace element to  another element with given  index, like replace method in String

        System.out.println(list1);

        ArrayList<String> names=new ArrayList<>();
        names.add("Max");
        names.add("Jake");
        names.add("Mike");
        names.add("Ben");
        names.add("Sam");

        System.out.println(names);
        names.set(3, "Tyron");

        System.out.println(names);

        int[] arr ={1,2,3,4};

        arr[3]=5;
        System.out.println(Arrays.toString(arr));

        ArrayList<Character> list=new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');


        list.remove(2);    // remove(index) returns void, element on the index 2 will be removed so the size of the list will be reduced.

        Character ch='D';
        list.remove(ch);  // selected element will be removed .

        list.remove(Character.valueOf('A'));  // or use valueOF method to convert primitive to wrapper class, then we can directly use remove method.

        boolean b1=list.remove(Character.valueOf('X'));  // remove(Object) returns boolean, there is no element 'X', so the boolean expression will be false.

        System.out.println(list);
        System.out.println(b1);
    }
}
