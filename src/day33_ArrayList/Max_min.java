package day33_ArrayList;

import java.util.ArrayList;

public class Max_min {

    public static void main(String[] args) {

        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        num.add(6);


        int max=num.get(0);
        int min=num.get(0);

        for (int each: num){
            max=Math.max(each,max);

            min=Math.min(each,min);

        }

        System.out.println(max);
        System.out.println(min);
    }
}
