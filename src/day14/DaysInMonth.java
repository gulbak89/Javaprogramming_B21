package day14;

public class DaysInMonth {

    public static void main(String[] args) {

        int year = 2020;
        String month = "January";

        String result = "";

        switch (month) {

            case "January":
                result = "31 days";
                break;

            case "February":
                result = (year % 4 == 0) ? "29 days" : "28days";
                // we can apply if statement here.
                break;

            case "March":
                result = "31 days";
                break;

            case "April":
                result= "30 days";
                break;

            case "May":
                result= "31 days";
                break;

            case "June":
                result= "30 days";
                break;

            case "July":
                result= "31 days";
                break;

            case "August":
                result= "31 days";
                break;

            case "September":
                result= "30 days";
                break;

            case "October":
                result= "31 days";
                break;

            case "November":
                result= "30 days";
                break;

            case "December":
                result= "31 days";
                break;

            default:
                result="Invalid input";    // no need to give break statement, if the default block given at the end of the switch statement.



        }

        System.out.println(result);
    }
}
