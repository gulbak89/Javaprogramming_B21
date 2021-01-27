package day45_Excaption;

import java.util.NoSuchElementException;

public class MultiCatchBlock {

    public static void main(String[] args) {

    try {
    System.out.println(25 / 0);    //Arithmetic exception

    }catch (NoSuchElementException e){
        System.out.println("no such element exception");

    }catch (ClassCastException e){
        System.out.println("class cast exception");

    }catch(ArithmeticException e){
        System.out.println("arithmetic Exception");

    }catch (NullPointerException e){
        System.out.println("null point exception");

    }catch (RuntimeException e){
        System.out.println("run time exception");

    }     // multiCatchBlock is only for unchecked exception,
        // and should be a "child first then the parent" order, which means parent exception type cannot placed before the child exception type

        System.out.println("=======================================");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("=======================================");

        String[] names={"Mike","Max","Marry","Bill","Phil","Jill"};

        try {
            names[10] = "Nancy";
        }catch (IllegalArgumentException e){
            System.out.println("Illegal argument exception");

        }catch(NoSuchElementException e){
            System.out.println("No such Element exception");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String Index Out of bound exception");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception");

        }catch(RuntimeException e){
            System.out.println("Runtime exception");
        }

    }
}
