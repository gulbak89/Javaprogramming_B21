package day41_Encapsulation;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.publicVariable);
        System.out.println(Data.defaultVariable);
        System.out.println(Data.protectedVaribale);

        Data obj=new Data();


        Data.publicMethod();
        Data.defaultMethod();
        //Data.privateMethod();  private method can not be called in the different class






    }
}