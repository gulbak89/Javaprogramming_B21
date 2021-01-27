package day11_MultiBranch_if_statement;

public class Max_Min {

    public static void main(String[] args) {

        int a = 2;
        int b = 8;
        int c = 5;

        int max = 0;

        if ( a>b && a>c) {

            max = a;
        } else if (b>a && b>c ) {
            max = b;
        }else {
            max = c;
        }
        System.out.println(max+" is max");
    }
}
