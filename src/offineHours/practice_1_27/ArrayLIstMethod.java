package offineHours.practice_1_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLIstMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list.size());

        for (int i=1; i<=100; i++){
            list.add(i);
        }

        System.out.println(list.size());

        list.addAll(Arrays.asList(200,300,400,500));

        list.remove(100);
        list.remove(100);
        list.remove(Integer.valueOf(400));
        list.remove(Integer.valueOf(500));
        list.forEach(p->{
            System.out.print(" "+p);
        });

        System.out.println();


        System.out.println("list.size() = " + list.size());


    }


}
