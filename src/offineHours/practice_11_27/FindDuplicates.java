package offineHours.practice_11_27;

import java.util.ArrayList;

public class FindDuplicates {

    public static void main(String[] args) {

        char[] arr={'A','B','C','D','C','D'};
        ArrayList<Character> list=new ArrayList<>();

        for (char each: arr){
            int count=0;

            for (char each1:arr){
                if(each==each1){
                    count++;
                }
            }

            if(count>1 && !list.contains(each)){
                list.add(each);
            }
        }

        System.out.println(list);










    }
}
