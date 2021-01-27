package day11_MultiBranch_if_statement;

public class Ternary_Practice {

    public static void main(String[] args) {

        int num = 1001;

        String result= (num%2==0)? "Even" : "odd";     // "?" is short ternary for if    ":" is short ternary for else

        System.out.println(result);

        System.out.println("======================================================");


        int age = 0;
        String result2 = (age>=21)? "Eligible to buy alcohol" : "Not eligible to buy alcohol";
        System.out.println(result2);

        System.out.println("=======================================================");

        int Age = 17;
        String Citizen ="USA";
        String Result3 = (Citizen=="USA" && Age>=18)? "Eligible to vote" : "Not eligible to vote";
        System.out.println(Result3);

        System.out.println("========================================================");

        int Num = 1000;
        String RESULT = (Num>0)? "Positive" : (Num < 0)? "Negative" : "Zero";  // ternary for multi branch statement

        System.out.println(RESULT);


        System.out.println("=================================================================");

        int a = 20;
        int b = 10;
        int Max = (a>b)? a : b;
        int Min = (a<b)? a : b;



        System.out.println("Maximum number is "+Max);
        System.out.println("Minimum number is "+Min);

        System.out.println("=================================================================");

        int x = 39;
        int y = 67;
        int z = 29;

        int max= (x>y && x>z)? x: (y>x &&y>z)? y: z;
        int min= (x<y && x<z)? x: (y<x &&y<z)? y: z;


        System.out.println("maximum number is "+ max);
        System.out.println("minimum number is "+ min);







    }

}
