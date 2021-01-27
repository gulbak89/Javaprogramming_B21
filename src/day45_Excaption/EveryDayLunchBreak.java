package day45_Excaption;

import java.time.LocalTime;

public class EveryDayLunchBreak {

    public static void main(String[] args) {

        LocalTime currentTime=LocalTime.now();

        LocalTime lunchTime=LocalTime.of(13,0);

        if(currentTime.equals(lunchTime)){
            throw new LunchBreakException("It is lunch time, come on!");
        }else{
            System.out.println("Continue the class");
        }
    }
}
