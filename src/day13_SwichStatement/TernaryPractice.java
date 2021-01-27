package day13_SwichStatement;

public class TernaryPractice {
    public static void main(String[] args) {

        int num = 101;

        String result=(num%2==0)?"even":"odd";
        System.out.println(result+" number");

        String Result =(num>0)?"Positive":(num<0)? "Negative":"zero";
        System.out.println(Result+" number");

        System.out.println("=========================================");

        int number =9;

        if(number>=1 && number<=7) {
            String days = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday"
                    : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
            System.out.println(days);
        }else {
            System.out.println("invalid number");
        }











    }
}
