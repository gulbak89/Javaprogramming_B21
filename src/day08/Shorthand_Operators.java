package day08;

public class Shorthand_Operators {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);

        a = 30;
        System.out.println(a);
        System.out.println("========================");

        int b = 10;
            b = 30;

        System.out.println(b);

        System.out.println("==========================");

        String schoolName= "Cybertek";
               schoolName = "MIT";  // reassign the variable

        System.out.println(schoolName);

        System.out.println("============================");

        int A = 10;
            A -= 7; // ==> a = a - 7

        System.out.println(A);

        int x = 100;
            x-= 62;  // x = 100- 62
        System.out.println(x);
        System.out.println("=================================");

        double salary = 100000;  // salary before tax
            salary-= (salary*0.28);  //tax rate is 0.28
        System.out.println(salary);   // salary after tax

        System.out.println("==================================");

        int x2 = 99999;
            x2-= 25;
        System.out.println(x2);

        System.out.println("====================================");

        double balance = 2000;
               balance-= 450;
        System.out.println(balance);

        balance-=1000;
        System.out.println(balance);

        System.out.println("=======================================");

        int deposit = 4000;
            deposit+= 5000;  // addition assignment
        System.out.println(deposit);

        System.out.println("========================================");

        int y2 = 400;
            y2 += 10000*0.1;
        System.out.println(y2);

        System.out.println("==========================================");

        String SchoolName = "MIT";
               schoolName+= " school";
        System.out.println(schoolName);

        System.out.println("==========================================");

        int B = 10;
            B*= 10;  // multiplication assignment
        System.out.println(B);

        double totalTax = 10000;
               totalTax *= 0.28;

        System.out.println(totalTax);

        int bonus = 5000;
            bonus *= 2+1;
        System.out.println(bonus);

        System.out.println("=========================================");

        int Y = 10;
            Y /= 5;  // division assignment
        System.out.println(Y);

        int house = 500000;
        int month = 240;
        double monthlypayment= 500000;
               monthlypayment /= 240;

        System.out.println(monthlypayment);
        System.out.println("============================================");

        int Z = 100;
            Z%= 3;    // remainder assignment

            System.out.println(Z);

            int r = 2000;
                r%= 2;
                System.out.println(r);
















    }
}
