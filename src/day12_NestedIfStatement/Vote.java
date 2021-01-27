package day12_NestedIfStatement;

public class Vote {
    public static void main(String[] args) {

        String citizen = "Canada";
        int Age = 18;

        if(citizen=="USA") {
            if(Age>=18) {
                System.out.println("Eligible to vote");
            }else {
                System.out.println("Not eligible to vote");
            }
        }else {
            System.out.println("Not eligible to vote");
        }






    }


}
