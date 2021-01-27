package day10_Ifelse_Statement;

public class max_min2 {  // assume that none of them are equal
    public static void main(String[] args) {

        int a = 520;
        int b = 920;
        int c = 420;


        String max= " is maximum number.";
        String min= " is minimum number.";

        boolean aismax = a>b && a>c; //if a is greater than both b a and c ==> a is max
        boolean bismax = !aismax && b>c; //a is not max and b is greater than c ==> b is max
        boolean cismax = !aismax && !bismax;  //a is not max and b is not max ==> c is max
        boolean aismin = a<b && a<c;
        boolean bismin = !aismin && b<c;
        boolean cisnmin = !aismin && !bismin;

        int minimum =1;


        if(aismax) {

            System.out.println(a+max);


        }

        if(bismax) {

            System.out.println(b+max);
        }

        if(cismax) {

            System.out.println(c+max);
        }

        if(aismin) {

            minimum =a;
        }

        if(bismin) {

            minimum =b;
        }

        if(cisnmin) {

            minimum = c;
        }

        System.out.println(minimum+min);
    }
}
