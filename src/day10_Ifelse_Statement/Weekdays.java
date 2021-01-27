package day10_Ifelse_Statement;

public class Weekdays {

    public static void main(String[] args) {

        int number = 1;
        String weekdays = "";

        if (number==1) {
            weekdays= "Monday";

        }else if ( number ==2) {
            weekdays="Tuesday";
        }else if (number ==3) {
            weekdays = "Wednesday";
        }else if (number==4) {
            weekdays= "Thursday";
        }else if ( number ==5) {

            weekdays = "Friday";
        }else if(number ==6) {
            weekdays="Saturday";
        }else {
            weekdays= "Sunday";
        }

        System.out.println("it is " + weekdays);
    }
}
