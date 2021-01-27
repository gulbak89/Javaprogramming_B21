package day13_SwichStatement;

public class DaysinMonth {
    public static void main(String[] args) {   // to make format : command + Option + l

        int year = 2020;
        int month = 0;
        String result = "";
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28or29days = month == 2;
        boolean has31days = !has28or29days && !has30days;

        if (month > 0 && month < 13) {
            if (month == 2) {
                if (year % 4 == 0) {
                    result = "29 days";
                } else {
                    result = "28 days";
                }
            } else if (has30days) {
                result = "30 days";
            } else {
                result = "31 days";
            }


        } else {
            result = "invalid input";
        }
        System.out.println(result);

    }

}




