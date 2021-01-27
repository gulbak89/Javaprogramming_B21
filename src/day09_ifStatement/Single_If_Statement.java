package day09_ifStatement;

public class Single_If_Statement {

    public static void main(String[] args) {

        int age = 25;
        boolean Eligible = age >=21;

        if(Eligible) {

            System.out.println("You are eligible to buy alcohol");
        }

        if (!Eligible) {

            System.out.println("go buy your milk");

        }

        System.out.println("=======================================");

        boolean isBreakTime = true;

        if (isBreakTime) {

            System.out.println("Time to take a break");
        }

        if (!isBreakTime) {

            System.out.println("Continue the class");
        }


        System.out.println("=====================================");

        int num = 99;
        boolean isEvenNum = num%2 ==0;
        boolean isOddNumb = !isEvenNum;

        if (isEvenNum) {

            System.out.println("number is even");
        }

        if (!isEvenNum) {

            System.out.println("number is odd");
        }










    }
}
