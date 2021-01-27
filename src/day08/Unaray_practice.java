package day08;

public class Unaray_practice {

    public static void main(String[] args) {

        int a = 100;
        int b = -a++ + ++a - a-- * a-- % 2;
        //b = -100 + 102 - 102 * 101 % 2 = -100 +102 -0 = 2

        System.out.println(b);



    }
}
