package day09_ifStatement;

public class Maximum_Minimum {

    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 100;

        boolean isnum1Max = num1> num2;
        boolean isnum2Max = num1< num2;
        boolean isequal = !isnum1Max && !isnum2Max;

        if(isnum1Max) {

            System.out.println(num1+" is maximum number ");
        }

        if (isnum2Max) {

            System.out.println(num2+ " is maximum number");
        }

        if (isequal) {

            System.out.println(num1+ " is equal to "+num2);
        }


        boolean isnum1Min = num1 < num2;
        boolean isnum2Min = num2 < num1;

        if (isnum1Min) {

            System.out.println(num1+ " is minimum number");

        }

        if (isnum2Min) {

            System.out.println(num2+ " is minimum number");
        }

    }
}
