package day07_UnaryOperator;

public class PostPre {
    public static void main(String[] args) {

        int x =2;
        int y = x ++;

        System.out.println(x);
        System.out.println(y);
        System.out.println("==========================================");

        int x2 = 2;
        System.out.println(x2++);
        System.out.println(x2);

        System.out.println("========================================");

        int x3 = 2;
        System.out.println(--x3);

        System.out.println("=========================================");

        int x4 = 8;
        int y4 = x4--;

        System.out.println(y4);
        System.out.println(x4);

        System.out.println("==============================================");

        int a = 1;
        int b = -a -- + a++ / -a-- * --a;
        //  b = -1 + 0/-1 * -1 = -1
        System.out.println(b);

        System.out.println("=================================================");

        int A = 50;
        int B = --A + A++ + A-- + A++;
           // B = 49 + 49 + 50 + 49 = 197

        System.out.println(B);

        System.out.println("===================================================");

        int X= 4;
        int Y = X * 4- X++;
        // Y =  4 * 4 - 4 = 12

        System.out.println(Y);

        System.out.println("==================================================");

        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        //  p = -101 * -101/ 100 + 100 = 102 +100 = 202

        System.out.println(p);

        System.out.println("====================================================");

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20 + -19 + 19 * 19 % 2 = -20 - 19 + 19 * 19 % 2= -20 -19 +1 = -38

        System.out.println(W);
        System.out.println(R);

        System.out.println("=====================================================");

        int M = 300;
        int N = 400;

        int J = M + N -M * N + M / N;
        //J = 300+400-300*400+300/400 = 700-1200+3/4 =700-1200+0 = -500
        int U = ++M + N++ -M-- % 2 + --N% 2;
        //  U = 301 + 400-301 % 2 + 400%2= 301 + 400-1 +0 = 700
        System.out.println(J);

        System.out.println(U);








    }


}
