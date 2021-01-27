package day43_Inheritance.carTask;

public class BMW extends Car{

    public static boolean isExpensive, isLuxury, breaksAlot;
    static {
        isExpensive=true;
        isLuxury=true;
        breaksAlot=true;
    }

    public BMW(String model, String color,  int year, double price, int miles) {
        setInfo("BMW",model,color,"Germany",year,price,miles);

    }

    public void race(){
        System.out.println(brand+" "+model+" is racing");
    }


}
