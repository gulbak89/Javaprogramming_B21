package day23_NestedLoop;

public class NestedLoop {

    public static void main(String[] args) {  // if we need to repeat the loop multiple time, then we need nested loop

        for(int j=1; j<=10; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");

            }
            System.out.println();


        }

        System.out.println("===================");


        for(int j=1; j<=10; j++){
            for(int i=1; i<=7; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("=====================");

        for(int j=1; j<=8; j++){
            for(int i=1; i<=j; i++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("=======================");

        for(int j=8; j>=1; j--){
            for(int i=j; i>=1; i--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }
}
