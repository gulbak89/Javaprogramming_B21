package day33_ArrayList;

import java.util.ArrayList;

public class ListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> scores= new ArrayList<>();

        scores.add(100);                     // autoboxing ...   size of the Array List is now 1, index number is 0
        scores.add(90);                      // int(90) assigned to wrapper class Integer internally , so it is called auto boxing. now the size is 2, index is 1
        scores.add(80);                      // add method
        scores.add(0,95);      // we can add the element to whatever the index we want to add to (if the index is existed). Don't skip the index.

        System.out.println(scores.toString());

        System.out.println("================================");
        ArrayList<String> shopList=new ArrayList<>();
        shopList.add("bread");
        shopList.add("eggs");
        shopList.add("water");
        shopList.add("milk");
        shopList.add(0,"Toilet paper");
        shopList.add(1,"Hand sanitizer");
        shopList.add(1,"N95 Mask");

        int total=shopList.size();


        System.out.println(shopList.toString());

        System.out.println(shopList.get(0));

        System.out.println(total);

        System.out.println(shopList.get(shopList.size()-1));













    }
}
