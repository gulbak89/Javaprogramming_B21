package day08;

public class RelationalOperation {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        boolean result = num1 > num2;  // greater operator ">"
        boolean RESULT = num2 > num1;

        System.out.println(num1+" is greater than "+ num2+" is "+result+".");
        System.out.println(num2+" is greater than "+num1+" is "+RESULT+".");

        System.out.println("=================================================");

        boolean r1 = num1 < num2;
        boolean r2 = num2 < num1; // less than operator "<"

        System.out.println(num1+ " is less than "+num2+" is "+r1);
        System.out.println(num2+ " is less than "+num1+" is "+r2);

        System.out.println("================================================");

        System.out.println(10>9);
        System.out.println(10<9);

        System.out.println("=================================================");

        System.out.println(10 > 10);
        System.out.println(10 >= 10);  //greater than or equal to  ">="
        System.out.println(10 <= 10);  // smaller than or equal to "<="
        System.out.println(10 ==10);   // equal to  "=="
        System.out.println(10 != 10);  // not equal to  "!="
        System.out.println("================================================");

        boolean t = " me"=="you";
        boolean g = "I am " == "good girl";
        System.out.println(t);
        System.out.println(g+", wattttttt!");
        System.out.println("================================================");

        int x = 100;
        boolean isEven = x % 2 == 0;
        System.out.println(x+" is a even number is "+isEven);

    }
}
