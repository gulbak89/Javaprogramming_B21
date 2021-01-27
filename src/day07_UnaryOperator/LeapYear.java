package day07_UnaryOperator;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        int remainder = year%4;
        boolean isleapyear = remainder < 1;

        System.out.println("year "+year+" is a leap year is "+isleapyear);






    }
}
