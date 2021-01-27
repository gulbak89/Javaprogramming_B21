package day29_methods;

public class MethodsWithoutParameters2 {
    public static void main(String[] args) {

        PrintEvenFrom1To100();
        System.out.println("==================================================");
        PrintOddFrom1to100();






    }

    public static void PrintEvenFrom1To100(){
        for (int i=1; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
    }

    public static void PrintOddFrom1to100(){
        for (int i=1; i<=100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
