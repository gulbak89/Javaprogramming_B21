package day10_Ifelse_Statement;

public class Year {

    public static void main(String[] args) {

        int year = 2021;
        if(year%4==0) {
            System.out.println(year+ " is leap year");
        } else {
            System.out.println(year+ " is not a leap year");
        }
    }
}
