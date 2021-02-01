package day52_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionIntro {
    public static void main(String[] args) {

        Collection<Integer> numbers=new ArrayList<>();   //upCasting

        numbers.add(100);
        numbers.addAll(Arrays.asList(200,300,400,500));
        System.out.println("numbers.size() = " + numbers.size());

        numbers.removeAll(Arrays.asList(200,400));
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("((ArrayList)numbers).get(0) = " + ((ArrayList) numbers).get(0));    //downCasting

        Collection<String> names=new LinkedList<>();
        Collection<Integer> scores=new LinkedList<>();






    }
}
