package day12_NestedIfStatement;

public class Loan {
    public static void main(String[] args) {

        double salary = 20000;
        int YearOnJob = 15;
        int creditScore = 590;

        if(salary>=30000) {
            if(YearOnJob>=2) {
                if(creditScore>=680) {               //Nested If Statement
                    System.out.println("Eligible to get a loan");
                }else {
                    System.out.println("Not eligible to get a loan");
                }
            }else {
                System.out.println("Not eligible to get a loan");

            }
        }else {
            System.out.println("Not eligible to get a loan");
        }
    }
}
