package day14;

public class DaysInMonth2 {

    public static void main(String[] args) {

        int year = 2021;
        String month = "Feb";
        String result = "";

        switch (month) {

            case "Feb":
                result = (year % 4 == 0) ? "29 days" : "28 days";
                break;


            case "April":
            case "June":
            case "September":
            case "November":
                result = "30 days";
                break;

            case "Jan":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result = "31 days";
                break;

            default:
                result = "Invalid input";
        }

        System.out.println(result);
    }
}
