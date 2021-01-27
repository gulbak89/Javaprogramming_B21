package offineHours.practice_12_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndSecondMin {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,1,1,2,3,4,5,6,7,8,9,10,10,10));
        list.removeAll(Arrays.asList(Collections.max(list)));  // to remove all the maximum number
        System.out.println(Collections.max(list));             // second max will be the Maximum number now

        list.removeAll(Arrays.asList(Collections.min(list)));
        System.out.println(Collections.min(list));

        /*
        summary:
        to find the second max number, first remove all the maximum numbers
        the next max number is the second max number



         */











    }
}
