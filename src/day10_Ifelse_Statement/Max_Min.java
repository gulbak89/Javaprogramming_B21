package day10_Ifelse_Statement;

public class Max_Min {

    public static void main(String[] args) {

        int a = 120;
        int b = 20;
        int c = 120;

        boolean aismax = a>b && a>c; //if a is greater than both b a and c ==> a is max
        boolean bismax = b>a && b>c;
        boolean cismax = c>a && c>b;
        boolean aismin = a<b && a<c;
        boolean bismin = b<a && b<c;
        boolean cismin = c<a && c<b;
        boolean equal  = a==b && b==c;

        if(aismax) {

            System.out.println(a+" is maximum number");
        }

        if(bismax) {

            System.out.println(b+" is maximum umber");
        }

        if(cismax) {

            System.out.println(c+" is maximum number");
        }

        if(aismin) {

            System.out.println(a+ " is minimum number");
        }

        if(bismin) {

            System.out.println(b+" is minimum");
        }

        if(cismin) {

            System.out.println(c+ " is minimum");
        }
        if(equal) {

            System.out.println(a+", "+b+", "+c+" are equal");
        }



    }
}
