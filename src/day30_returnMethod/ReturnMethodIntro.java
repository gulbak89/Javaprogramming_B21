package day30_returnMethod;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        addition(3,5);

        System.out.println(addition2(4,5));

        int number=addition2(3,5)*3;
        System.out.println(number);



    }

    public static void addition(int n1, int n2){
        int n3=n1+n2;
        System.out.println(n3);
    } // void can not return the dataType to the main method

    public static int addition2(int n1, int n2){
        int n3=n1+n2;
        return n3;
    } // return method can return the dataType to the main method
}
