package day11_MultiBranch_if_statement;

public class Grate_Report {

    public static void main(String[] args) {

        int a = 98;// 0 to 100;
        String result = " ";

        if(a<60) {

            result = "failed";
        } else if ( a>=60 && a<90) {
            result= "passed";
        }else {
           result= "passed with distinction";
        }
        System.out.println(result);
    }
}
