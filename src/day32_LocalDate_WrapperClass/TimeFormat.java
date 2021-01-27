package day32_LocalDate_WrapperClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
Local date:
year: yy,yyyy
month: MM(number), MMM(three letters), MMMM(full name of the month)
day:dd

month/day/year


name of day: E(three letters), EEEE(full name of the day)


Local time:
hours: hh
minutes: mm
seconds: ss
am/pm: a
 */

public class TimeFormat {
    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM/dd/yyyy EEEE");

        LocalDate today=LocalDate.now();  // 2020-11-23
        System.out.println(today);

        System.out.println(today.format(df));

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now=LocalTime.now();

        System.out.println(now.format(tf));

        // Monday, 12:40 PM, Nov/23/2020

        LocalDateTime t1=LocalDateTime.of(2020,11,23,12,40);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEE, hh:mm a, MMMM/dd/yyyy");

        System.out.println(t1.format(dtf));

        LocalDate tomorrow=LocalDate.of(2020,11,24);
        System.out.println(tomorrow.format(df));

       boolean b1= today.isBefore(tomorrow);
       boolean b2=today.isAfter(tomorrow);

        System.out.println(b1);
        System.out.println(b2);

        // calculate age

        int currentYear=LocalDate.now().getYear();   // 2020/11/23
        System.out.println(currentYear);

        LocalDate dob=LocalDate.of(1989,11,19);
        int age=currentYear-dob.getYear();

        System.out.println(age);

        System.out.println(dob.plusDays(21));

        LocalDate righnow=LocalDate.now();
        LocalDate holidayBreak=righnow.plusDays(2);

        System.out.println("Holiday break starts on "+holidayBreak);

        LocalTime nowt=LocalTime.now();
        LocalTime lunchBreak=nowt.plusMinutes(15);

        System.out.println("Lunch break will be from "+lunchBreak);

        LocalTime clasStarts=LocalTime.of(10,00);
        LocalTime firstBreak=clasStarts.plusMinutes(45);

        System.out.println("First break starts from "+firstBreak);

        LocalTime secondBreak=firstBreak.plusMinutes(15).plusMinutes(45);
        System.out.println("Second break starts from "+secondBreak);



    }
}
