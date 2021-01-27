package offineHours.practice_12_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin2 {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8,9,10,10));

        ArrayList<Integer> temp=new ArrayList<>(list);

        temp.removeIf(p->p==Collections.max(temp));
        System.out.println(Collections.max(temp));

        temp.removeIf(p->p==Collections.min(temp));
        System.out.println(Collections.min(temp));

    }
}
