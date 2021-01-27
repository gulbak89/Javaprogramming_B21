package day12_NestedIfStatement;

public class Grade_report {
    public static void main(String[] args) {

        int score = 89;
        String Grade = "";

        if (score>=0 && score<=100) {    // Pre-conditon of the Nested If Statement
           Grade= (score>=90)? "A": (score>=80)? "B": (score>=70)? "C": (score>=60)? "D":"F";  // used Ternary here
        }else {
            System.out.println("not valid score");
        }
        System.out.println(Grade);





    }




}
