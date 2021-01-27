package day11_MultiBranch_if_statement;

public class Scores {
    public static void main(String[] args) {

        double score = 70;
        String Grade= "A";

        if(score>=90) {
            Grade = "A";
        }else if(score>=80) {
            Grade = "B";

        }else if (score>=70) {
            Grade="C";
        }else if (score>=60) {
            Grade= "D";
        } else {
            Grade="F";
        }

        System.out.println(Grade);
    }
}
