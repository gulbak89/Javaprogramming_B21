package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques {

    public static void main(String[] args) {

        String str="aabbssddfbddsr";

        ArrayList<Character> list=new ArrayList<>();

        for (char each:str.toCharArray()){
            list.add(each);
        }

        for (Character each: list){
            int frequency=Collections.frequency(list,each);
            if(frequency==1){
                System.out.println(each);
            }
        }







    }
}
