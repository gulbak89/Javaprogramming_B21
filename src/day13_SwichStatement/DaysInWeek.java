package day13_SwichStatement;

public class DaysInWeek {

    public static void main(String[] args) {


        int n =7;
        String day = "";

        switch(n) {         // data type is int in this switch

            case 1:         // so, case value also need to be int
              day="monday";
                break;


            case 2:
                day="Tuesday";
                break;

            case 3:
                day="Wednesday";
                break;      // used for exiting the switch statement. if we don't give break statement, then the next available block gets executed until there is no any statement.


            case 4:
                day="Thursday";
                break;

            case 5:
                day="Friday";
                break;

            case 6:
                day="Saturday";
                break;

            case 7:
                day="Sunday";
                break;


            default:       // default block can be put anywhere in the switch, not necessary to be put at the end, but it is prefer to be put at the end of the switch.
                System.out.println("Invalid Value");
                break;




        }
        System.out.println(day);
    }
}
