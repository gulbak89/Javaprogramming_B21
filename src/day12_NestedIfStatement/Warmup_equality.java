package day12_NestedIfStatement;

public class Warmup_equality {

    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 4;
        int n3 = 5;

        String result = " ";

        if (n1==n2 && n2== n3) {
            result = " all are equal ";
        }else if (n1==n2) {
            result = "n1 and n2 are equal";
        }else if (n2==n3) {
            result= "n2 and n3 are equal";
        }else if(n1==n3) {
            result= "n1 and n3 are equal ";
        }else {
            result= "none of them are equal";
        }
        System.out.println(result);

        System.out.println("===================================================");

        String result2 = (n1==n2&&n2==n3)?"all are equel":(n1==n2)? "n1 and n2 are equal":(n2==n3)?"n2 and n3 are equal":(n1==n3)?"n1 and n3 are equal":"none of them are equal";
        System.out.println(result2);   // using Ternary
    }
}
