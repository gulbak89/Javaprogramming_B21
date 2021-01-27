package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice4 {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(40);
        list.add(40);
        list.add(50);

       int n1= list.indexOf(10);
        System.out.println(n1);

        int n2=list.lastIndexOf(10);
        System.out.println(n2);
        System.out.println("==========================================");

        System.out.println(list.contains(60));   // contains method returns boolean expression
        System.out.println(list.contains(50));

        System.out.println("=================================");
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('a');
        characters.add('b');
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('d');
        characters.add('e');

        ArrayList<Character> nonDup=new ArrayList<>();

        for (char each: characters){
            if(nonDup.contains(each)){
                continue;
            }else{
                nonDup.add(each);
            }
        }

        System.out.println(nonDup);

        System.out.println("========================================");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(1);


        System.out.println(list1.equals(list2));  // order of the each element in each list is different


        list2.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());









    }
}
