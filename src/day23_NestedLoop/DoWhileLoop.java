package day23_NestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition= false;
        while(condition){
            System.out.println("HI");
        }
        System.out.println("=============================");

        do{
            System.out.println("hi");
        }while(condition);     // do first and think later. because the condition is false, so it printed the statement only once, if the condition is true, it will print it over and over again.

    }
}
