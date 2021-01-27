package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperation {

    public static void main(String[] args) {

        //containsAll => verify if the collection of elements are contained or not; Arrays.asList

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        /*

        boolean r1=list.contains(10);
        System.out.println(r1);

        boolean r2=list.contains(10) && list.contains(20)&& list.contains(30)&& list.contains(40) && list.contains(50);
        System.out.println(r2);

        */

        boolean b=list.containsAll(Arrays.asList(10,20,30,40,50));
        System.out.println(b);

        ArrayList<String> group1=new ArrayList<>();
        group1.add("Meryemgul");
        group1.add("Sadikjan");
        group1.add("Guljennet");
        group1.add("Kasimjan");

        System.out.println(group1.containsAll(Arrays.asList("Ahmad","Ercan","Biden")));

        ArrayList<Integer> num=new ArrayList<>();
        num.addAll(Arrays.asList(3,4,5,6,7));

        System.out.println(num);

        String[] arr={"Mike","Ben","Sherlock"};
        ArrayList<String> students=new ArrayList<>();

        students.addAll(Arrays.asList(arr));
        System.out.println(students);

        ArrayList<String> names=new ArrayList<>(Arrays.asList(arr));
        System.out.println(names);

        Integer[] arr2={1,2,3,4,5};

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(arr2));

        ArrayList<Character> ch1=new ArrayList<>(Arrays.asList('a','b','c','d','e'));

        ch1.addAll(Arrays.asList('h','I','j','k','l','k','j'));

        System.out.println(ch1);

        System.out.println("=========================");

        //removeAll==> remove all the matching ones

        // do not use remove method in the loop without interface iterable

        ch1.removeAll(Arrays.asList('h','I','j','k','l'));
        System.out.println(ch1);

        System.out.println("================================");

        ArrayList<String> employes=new ArrayList<>();

        employes.addAll(Arrays.asList("Musajan","Ablimit","Nisahan","Pashagul","Zumretay","Kamiljan","Ahmad","Ahmad"));

        employes.removeAll(Arrays.asList("Ahmad"));

        System.out.println(employes);

        employes.retainAll(Arrays.asList("Ablimit"));

        System.out.println(employes);






















    }
}
