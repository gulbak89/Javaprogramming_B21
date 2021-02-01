package day52_collection;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {// List : can has index number and accepts duplicated elements

        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10));// internally uses array. retrieves faster --> get() method gets executed faster in ArrayList
        System.out.println("list1.get(0) = " + list1.get(0));


        List<Integer> list2=new LinkedList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10));//linkedList: has doubly linked, so .add() and .remove() method can get executed faster
        System.out.println("list2.get(0) = " + list2.get(0));

        List<Integer> list3=new Vector<>();   //Vector is synchronized(one thread at the time --> thread safety)
        list3.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3));

        List<Integer> list4=new Stack<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,10));  // Stack is child of Vector. it inherited all the methods from Vector class, so it also has synchronized method--> thread safety
                                                               // follows Last In First Out order --> pop() method : removes last inserted object from the Stack.
         ((Stack) list4).pop();


        System.out.println(list4);
        ((Stack) list4).pop();
        ((Stack) list4).pop();

        System.out.println(list4);

        System.out.println("========================================");

        Stack<String> names=new Stack<>();
        names.addAll(Arrays.asList("Cayle","Sara","Jeck","Max","Bill","John"));
        System.out.println(names);

        for (int i=1; i<=6; i++){
            names.pop();
        }
        System.out.println(names);


    }
}
