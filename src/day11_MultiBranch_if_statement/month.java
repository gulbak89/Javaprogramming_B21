package day11_MultiBranch_if_statement;

public class month {

    public static void main(String[] args) {
        /*
        28 days = 2
        30 days = 4, 6, 9, 11
        31 days = 1, 3, 5, 7, 8, 10, 12
         */



        int month = 12;  // 1 to 12
        boolean has28days = month ==2;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has31days = ! has28days && ! has30days;

        int days = 0;

        if ( has28days) {
           days = 28;
        }

        if (has30days) {
            days = 30;

        }

        if (has31days) {
            days = 31;
        }
        System.out.println(days+ " days");
    }
}
