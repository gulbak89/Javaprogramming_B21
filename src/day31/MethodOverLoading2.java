package day31;

public class MethodOverLoading2 {

    public static int sum(int a, int b){
        return a+b;

    }

    public static int sum(int a, int b, int c){
        return sum(a,b)+c;
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a,b)+sum(c,d);
    }

    public static double sum(double a, double b){
        return a+b;
    }

    public static double sum(double a, double b, double c){
        return sum(a,b)+c;
    }

    public static double sum(double a, double b, double c, double d){
        return sum(a,b,c)+d;
    }

    public static void main(String[] args) {

        System.out.println(sum(34,56));
        System.out.println(sum(34,56,34));
        System.out.println(sum(34,23,56,23));

        System.out.println(sum(3.4,2.3));
        System.out.println(sum(3.2,1.2,33));





    }

}
