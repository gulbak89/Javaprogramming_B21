package offineHours.practice_11_27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Combine2Arrays {

    public static void main(String[] args) {

        char[] ch1={'a','b','c','d','e'};
        char[] ch2={'f','g','h'};

        ArrayList<Character> list=new ArrayList<>();
        for (char each:ch1){
            list.add(each);
        }
        for (char each:ch2){
            list.add(each);
        }

        System.out.println(list);

        char[] combined=new char[list.size()];

        for (int i=0; i<list.size(); i++){
           combined[i]=list.get(i);
        }

        System.out.println(Arrays.toString(combined));


        LocalTime breakTime=LocalTime.now().plusMinutes(10);

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("h:mm a");

        System.out.println("Please come back at: "+breakTime.format(tf));


    }
}
