package day43_Inheritance.carTask;

public class Toyota extends Car{

    public static boolean isAffordable, isImmortal;

    static{
        isAffordable=true;
        isImmortal=true;
    }

    public Toyota(String model, String color,  int year, double price, int miles) {
        setInfo("Toyota",model,color,"Japan",year,price,miles);

    }




}
