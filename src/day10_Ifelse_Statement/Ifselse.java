package day10_Ifelse_Statement;

public class Ifselse {

    public static void main(String[] args) {

        int a = 1;
        boolean iseven = a%2<0;
        String even =" is even number";
        String odd = " is odd number";


        if(iseven) {
            System.out.println(a+even);
        } else {                           // when using "if-else" statement, there should be only two possibilities for the condition.
            System.out.println(a+odd);
        }




    }
}
