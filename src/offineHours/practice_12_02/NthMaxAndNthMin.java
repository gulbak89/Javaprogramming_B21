package offineHours.practice_12_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthMaxAndNthMin {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8,9,10,10,11,13,12,14,15,15));
        ArrayList<Integer> temp=new ArrayList<>(list);

        for (int i=1; i<5; i++) {
            temp.removeIf(p -> p == Collections.max(temp));


        }

        System.out.println(Collections.max(temp));

        for (int i=1; i<5; i++){
            temp.removeIf(p->p==Collections.min(temp));
        }

        System.out.println(Collections.min(temp));




    }
}
