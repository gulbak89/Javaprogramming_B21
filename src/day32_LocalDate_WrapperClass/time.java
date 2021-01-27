package day32_LocalDate_WrapperClass;

import java.time.LocalDateTime;
import java.time.LocalTime;
public class time {

    public static void main(String[] args) {
        LocalTime now=LocalTime.now();
        System.out.println(now);

        LocalTime whileAgo=LocalTime.of(11,15);

        System.out.println(whileAgo);

        System.out.println("=================================");

        LocalDateTime t=LocalDateTime.of(2020,11,23,11,19);
        System.out.println(t);


    }
}
