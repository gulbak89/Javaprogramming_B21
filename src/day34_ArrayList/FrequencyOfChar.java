package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class FrequencyOfChar {

    public static void main(String[] args) {


        String str="askdfjkdsjafldjk";
        String result="";

        ArrayList<String> list=new ArrayList<>();

        for (String each: str.split("")){
            list.add(each);
        }

        for (String each: list) {
            int frequency = Collections.frequency(list, each);

            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        System.out.println(result);

        System.out.println("======================");
        String result2="";

        ArrayList<Character> list2=new ArrayList<>();

        for (char each: str.toCharArray()){
            list2.add(each);
        }


        for (Character each: list2){
            int frequency2=Collections.frequency(list2,each);

            if(!result2.contains(each+"")){
               result2+=""+each+frequency2;
            }
        }
        System.out.println(result2);


    }
}
