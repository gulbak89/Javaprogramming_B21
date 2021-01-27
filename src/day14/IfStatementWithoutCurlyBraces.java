package day14;

public class IfStatementWithoutCurlyBraces {
    public static void main(String[] args) {


        int a = 10;

        if (a % 2 == 0)

            System.out.println("even number");
        else
            System.out.println("odd number");      // without the {}, blocks can contains one statement only

    }
}