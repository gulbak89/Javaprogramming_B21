package offineHours.Practice_11_25;

public class MethodPractice2 {
    public static void main(String[] args) {

        System.out.println(max(100,200));


        System.out.println(max(100,200,300));

        System.out.println(max(100,200,300,400));




    }
    public static int max(int a, int b){
        int max=(a>b)? a:b;

        return max;
    }
    public static double max(double a, double b){
        return (a>b)?a:b;
    }

    public static int max(int a, int b, int c){
        int n = max(a,b);
        int m=max(n,c);

        return m;
    }


    public static int max(int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }


    public static int min(int a, int b){
        return (a<b)?a:b;
    }

    public static int min(int a, int b, int c){
        return min(min(a,b),c);
    }

    public static int min(int a, int b, int c, int d){
        return min(min(a,b,c),d);
    }
}
