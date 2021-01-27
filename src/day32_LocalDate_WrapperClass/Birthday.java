package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {

        LocalDate DOB=LocalDate.of(1990,11,23);




    }

    public static void HappyBirthday(int month, int day){
        LocalDate today=LocalDate.now();
        LocalDate boD=LocalDate.of(1990,11,23);
        System.out.println("Happy Birthday!");

    }
}
