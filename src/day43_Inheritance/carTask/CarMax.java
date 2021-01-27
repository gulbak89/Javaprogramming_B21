package day43_Inheritance.carTask;

public class CarMax {
    public static void main(String[] args) {


        Toyota toyota=new Toyota("Corella","black",2017,30000,5000);

        BMW bmw=new BMW("X5","blue",2015,35000,4500);

        System.out.println(toyota);
        System.out.println(bmw);

        System.out.println(BMW.isLuxury);
        System.out.println(Toyota.isImmortal);


    }
}
