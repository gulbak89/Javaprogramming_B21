package day09_ifStatement;

public class IsEligible {

    public static void main(String[] args) {

        String name = "Gubek";
        int age = 18;

        boolean isEligible = age >= 21;

        System.out.println(name+" is eligible to buy alcohol is "+ isEligible);

        System.out.println("================================================");

        String Name = "John";
        String citizen = "USA";

        boolean eligible = citizen == "USA";

        System.out.println(Name + "is eligible to vote is "+ eligible);

        System.out.println("=================================================");

        String name2 = "Miranda";
        boolean isUSCitizen = false;

        boolean Eligible = isUSCitizen == true;

        System.out.println(name2+ " is eligible to vote is "+ Eligible);

        System.out.println("==================================================");

        int num = 0;
        if (num>0) {

            System.out.println("positive");
        }

        if (num<0){
            System.out.println("Negative");
        }

        if (num==0) {

            System.out.println("zero");
        }

        System.out.println("===============================");



      String option1 = "1";
      String option2 = "2";
      String option3 = "3";

        boolean option1selected = option1=="1";
        boolean option2selected = option2=="2";
        boolean option3selected = option3=="3";

        if (option1selected) {

            System.out.println("user selected 1");
        }

        if (option2selected) {
            System.out.println("user selected 2");
        }

        if (option3selected) {

            System.out.println("user selected 3");
        }












    }
}
