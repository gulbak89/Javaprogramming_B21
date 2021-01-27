package day19_loop;

public class Count1To1000 {
    public static void main(String[] args) {

        for(int i=0; i<=100; i++){  // count the numbers 0-1000

            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("=================================");

        for(int i=100; i<=200; i++){// count the numbers 1000-2000
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("======================================");

        for(int i=1; i<=100; i++){ // count all the odd numbers between 0-1000
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("=========================================");

        for(int i=0; i<=100; i++ ){  //count all the even numbers between 0-1000
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("==========================================");

        for(int i=1; i<=100; i+=2){ // count all the odd numbers between 0-1000
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("===========================================");

        for(int i=0; i<=100;i+=2 ){    //count all the even numbers between 0-1000
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("==================================================");

        for(int i= 1; i<=50; i++){
            System.out.print(i+"PushUp ");
        }
        System.out.println();
        System.out.println("==============================================");

        for(char chr =65; chr<=90; chr++ ){
            System.out.print(chr+" ");
        }
    }


}
