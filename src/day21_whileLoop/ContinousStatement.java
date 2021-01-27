package day21_whileLoop;

public class ContinousStatement {

    public static void main(String[] args) {

        for(int i=1; i<=50; i++){

            if(i%3!=0){
                continue;     // continue means skip, so in this case it will skip all the numbers that can not be evenly divisible by 3 between 1 to 50.
            }

            System.out.print(i+" ");   // it will print all the numbers that can be evenly divisible by 3 between 1 to 50.
        }


    }
}
