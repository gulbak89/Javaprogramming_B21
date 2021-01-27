package day29_methods;

public class MethodWithParameters {
    public static void main(String[] args) {

        int age=24;

        EligibleToBuyAlcohol(age);
        EligibleToBuyAlcohol(18);

        CalculateAge(1989,2020);


    }

    public static void EligibleToBuyAlcohol(int age){
        if(age>=21){
            System.out.println("eligible to buy alcohol");
        }else{
            System.out.println("not eligible to buy alcohol");
        }
    }

    public static void CalculateAge(int birrthYear, int currentYear){
        if(currentYear>birrthYear) {

            System.out.println("Your age is: " + (currentYear - birrthYear));
        }else{
            System.out.println("Invalid entry");
        }
    }
}
