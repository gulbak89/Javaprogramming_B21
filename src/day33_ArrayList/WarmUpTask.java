package day33_ArrayList;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class WarmUpTask {
    public static void main(String[] args) {

        LocalDateTime today=LocalDateTime.of(2020,11,24,13,0);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/dd/yyyy");
        System.out.println(today.format(df).replaceFirst("PM","pm"));

        System.out.println("========================================================");

        LocalDate[] tenDays=new LocalDate[10];
        DateTimeFormatter df1=DateTimeFormatter.ofPattern("MMMM_dd, EEEE");

        for (int i=0; i<10; i++){
            tenDays[i]=LocalDate.now().plusDays(i);

        }

        System.out.println(Arrays.toString(tenDays));

        for (LocalDate each: tenDays){
            System.out.println(each.format(df1));

        }

        System.out.println("============================================================");
        String[] names={"Patemgul","Rozilem","Halide","Risalet","Zeytunhan"};
        LocalDate[] dOB={LocalDate.of(1990,1,3),LocalDate.of(1986,4,6),
        LocalDate.of(1984,6,7),LocalDate.of(1989,9,14),LocalDate.of(1985,3,15)};

        String nameOfOlder=names[0];
        LocalDate Older=dOB[0];

        String nameOfYoungest=names[0];
        LocalDate youngest=dOB[0];

        for (int i=0; i<5; i++){

            if(dOB[i].isBefore(Older)){
                Older=dOB[i];
                nameOfOlder=names[i];
            }

            if(dOB[i].isAfter(youngest)){
                youngest=dOB[i];
                nameOfYoungest=names[i];
            }



        }
        System.out.println(nameOfOlder+" is oldest, her DOB is "+Older);
        System.out.println(nameOfYoungest+" is youngest, her DOB is "+youngest);


        System.out.println("=================================================");

        String s1="a1b2c3";
        String s2="Today's date is 11/24/2020";

        int sum1=0;
        int sum2=0;

        for (char each: s1.toCharArray()){
            if(Character.isDigit(each)){
                sum1+=Integer.parseInt(""+each); //if we use the parseInt method, it convert String to number, so we need to change Char to String by adding ""

            }
        }

        System.out.println(sum1);


        for (char each: s2.toCharArray()){
            if(Character.isDigit(each)){
                sum2+=Integer.valueOf(each) ;   // here we used ValueOf method, which can convert to Char to number, so we don't need to change Char to String
            }
        }

        System.out.println(sum2);







    }
}
