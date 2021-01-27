package day32_LocalDate_WrapperClass;

public class OverLoading {

    public static void main(String[] args) {  //compiler only executed the valid main method, java only recognize the valid main method
        System.out.println("String");
       int[] arr1={1,2,3};
       main(arr1);        //int                 other type of the main method can be overloaded



    }

    public static void main(int[] args){  // those are not valid main method
        System.out.println("int");

    }

    public static void main(double[] args){
        System.out.println("double");

    }

    public static void main(char[] args){
        System.out.println("char");

    }
}
