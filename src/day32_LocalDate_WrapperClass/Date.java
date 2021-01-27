package day32_LocalDate_WrapperClass;

import java.time.LocalDate;

public class Date {

    public static void main(String[] args) {

        LocalDate yesterday=LocalDate.of(2020,11,22);
        System.out.println(yesterday);

        LocalDate birthday=LocalDate.of(2020,2,29);

        System.out.println(birthday);

        System.out.println(yesterday.isLeapYear());    // boolean expression : isLeapYear method

        LocalDate today=LocalDate.now();     // now method
        System.out.println(today);


        LocalDate dateOfBirth=LocalDate.of(1989,11,19);
        System.out.println(dateOfBirth.isLeapYear());

        String[] arr={"memet","semet","rozehon","ayshemgul","patigul"};
        LocalDate b1=LocalDate.of(1979,1,3);
        LocalDate b2=LocalDate.of(1970,3,16);
        LocalDate b3=LocalDate.of(1969,5,20);
        LocalDate b4=LocalDate.of(1986,3,6);
        LocalDate b5=LocalDate.of(1983,4,7);

        LocalDate[] birthDay={b1,b2,b3,b4,b5};

        for (int i=0; i<5; i++){
            System.out.println(arr[i]+": "+birthDay[i]);
            System.out.println(arr[i]+" was born on leap year is "+birthDay[i].isLeapYear());
        }



        }
}
