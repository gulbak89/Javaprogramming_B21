package day09_ifStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 1001;
        boolean isEven = num%2==0;
        boolean isOdd = !isEven;   // "LOGICAL NOT "==> "!"

        System.out.println(num+ " is even number is "+ isEven );
        System.out.println(num+ " is Odd number is "+ isOdd);

        System.out.println("====================================");

        int n = 0;
        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean is0 = !isPositive && !isNegative;

        System.out.println(n+ " is positive is "+ isPositive);
        System.out.println(n+ " is negative is "+ isNegative);
        System.out.println(n+ " is 0 is "+ is0);

        System.out.println("=====================================");

        String wether = "Shiny";
        int degreee = 70;
        boolean r1 = !(wether == "rainy" || degreee== 70);

                     //!(FALSE || TRUE) ==> !TRUE ==> FALSE
        System.out.println("======================================");


        System.out.println(!!true);
        System.out.println(!!!false);



    }

}
