package day09_ifStatement;

public class Exam {
    public static void main(String[] args) {

        int year = 2020;
        boolean isPandemic = year == 2020;

        if (isPandemic) {

            System.out.println("wear mask");
        }

        if (!isPandemic) {

            System.out.println("be free");
        }


        System.out.println("===================");

        int age = 28;
        boolean isUSCitizen = false;

        boolean eligible = isUSCitizen && age>=18;

        if (eligible) {

            System.out.println("You are eligible to vote");
        }

        if (!eligible) {

            System.out.println("You are not eligible to vote");
        }

        System.out.println("========================================");





    }
}
