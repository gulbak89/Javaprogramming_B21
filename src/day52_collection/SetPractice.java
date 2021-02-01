package day52_collection;

import java.util.*;

public class SetPractice {// Set: does not have index, does not accept duplicated elements.
    static String str3;


    public static void main(String[] args) {

        Set<String> names1=new HashSet<>();  // HashSet (C): does not care about order at all, random order
        names1.addAll(Arrays.asList("Shir","Arslan","Bulbul","Kakkuk","Bore"));
        System.out.println("names1 = " + names1);


        Set<String> names2=new LinkedHashSet<>(); //LinkedHashSet (C): keeps the insertion order
        names2.addAll(Arrays.asList("Shir","Arslan","Bulbul","Kakkuk","Bore","Bore"));
        System.out.println("names2 = " + names2);

        Set<String> names3=new TreeSet<>();  //TreeSet (C): in sorted order -> means sorted automatically
        names3.addAll(Arrays.asList("Shir","Arslan","Bulbul","Kakkuk","Bore"));
        System.out.println("names3 = " + names3);

        System.out.println("====================================================");
        String str="andkfjdasddjkfls";

       String[] ch= str.split("");
       Set<String> uniqCh=new LinkedHashSet<>(Arrays.asList(ch));  //We can remove the duplicates and keep the order of the String by using LinkedHashSet
        System.out.println(uniqCh);

        for(String each: uniqCh){
            System.out.print(each);
        }

        System.out.println("===========================================");
        String str1="silent";
        String str2="listen";

        String s1=new TreeSet<>(Arrays.asList(str1.split(""))).toString();
        String s2=new TreeSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(s1.equals(s2));

        System.out.println("=============================================");


        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.addAll(Arrays.asList(null,null,null,null));

        System.out.println(hashSet);

        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>(Arrays.asList(null,null,null));
        System.out.println(linkedHashSet);

        //TreeSet<Integer> treeSet=new TreeSet<>(Arrays.asList(null,null,null));  //NullPointException
        //System.out.println(treeSet);

        System.out.println("==================================");

        Set<Integer> numbers=new HashSet<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("Collections.max(numbers) = " + Collections.max(numbers));
        System.out.println("Collections.min(numbers) = " + Collections.min(numbers));

        System.out.println("====================================");

        /*
        dddaaaaccbb
        output: d3a4c2b2
         */

        String  string="dddaaaaccbb";
        String[] array=string.split("");
        Set<String> strSet=new LinkedHashSet<>(Arrays.asList(array));
        List<String> strList=new ArrayList<>(Arrays.asList(array));

        String result="";
        for (String each1: strSet){
            int count=0;

            for (String each2: strList){
                if(each1.equals(each2)){
                   count++;
                }
            }
            result+=each1+count;
        }

        System.out.println(result);




        System.out.println(result);



        


    }

}
