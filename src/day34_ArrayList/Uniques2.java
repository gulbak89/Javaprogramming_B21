package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques2 {
    public static void main(String[] args) {


        String str="dksfksdjfkdsjpmnr";

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        list.removeIf(p->Collections.frequency(list,p)>1);
        System.out.println(list);
        String result=list.toString().replace(",","").substring(1).replace("]","");
        System.out.println(result);


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,2,1,3,2,3,5,7,9,8));   // unique elements: 4,6,7,8,9

        numbers.removeIf(p->Collections.frequency(numbers,p)>1);  // remove the elements that occurs more than once

        System.out.println(numbers);

        System.out.println("=======================================");



        ArrayList<Character> list2=new ArrayList<>();

        list2.addAll(Arrays.asList('d','1','9','%','$','#','r','t','¥'));

        list2.removeIf(p->Character.isDigit(p) || Character.isLetter(p));

        System.out.println(list2);

        System.out.println("==========================================");







    }
}
