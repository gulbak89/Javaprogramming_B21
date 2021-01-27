package day31;

public class Addition {

    public static int additionOf2(int n1, int n2){

        int sum=n1+n2;

        return sum;
    }



    public static int additionOf3(int n1, int n2, int n3){
        int sum=n1+n2+n3;

       return additionOf2(n1,n2)+n3;
    }

    public static int additionOf4(int n1, int n2, int n3, int n4){
        int sum=n1+n2+n3+n4;

        return additionOf3(n1,n2,n3)+n4;
    }



    public static void main(String[] args) {

        System.out.println(additionOf2(23,45));
        System.out.println(additionOf3(23,45,23));

        System.out.println(additionOf4(23,45,23,56));






    }
}
