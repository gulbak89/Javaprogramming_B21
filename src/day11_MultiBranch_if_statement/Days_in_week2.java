package day11_MultiBranch_if_statement;

public class Days_in_week2 {

    public static void main(String[] args) {

        int days = 7;
        String week = (days==1)? "Monday": (days==2)? "Tuesday": (days==3)? "Wednesday": (days==4)? "Thursday": (days==5)? "Friday": (days==6)? "Saturday": "Sunday";

        System.out.println("it is "+week);
    }
}
