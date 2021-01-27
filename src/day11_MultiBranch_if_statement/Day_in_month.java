package day11_MultiBranch_if_statement;

public class Day_in_month {
    public static void main(String[] args) {

        int month = 12;  // 1 to 12
        boolean has28days = month ==2;
        boolean has30days = month == 4 || month == 6 || month == 9 || month == 11;

        int days = 1;

        if(has28days) {

            days = 28;
        }else if(has30days) {
            days = 30;
        }else{
            days = 31;
        }
        System.out.println(days+ " days");

        int days2 = (has28days)? 28: (has30days)? 30: 31;     // Ternary for multi branch if statement/else-if
        System.out.println(days2);



    }
}
