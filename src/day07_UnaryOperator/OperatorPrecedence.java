package day07_UnaryOperator;

public class OperatorPrecedence {

    public static void main(String[] args) {
        /*
        highest order: *, /, %, and ()
        lowest order: +. -
         */

        int x = 2 + 3 * 2 / 1;
        int y = 3 * (2 +5);
        int z = 3 % 1 + 2;
        int w = 78 / 2 * 2 + 3 - 5 % 5;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);

    }

}
