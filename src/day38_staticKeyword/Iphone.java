package day38_staticKeyword;

public class Iphone {

    public String model, color;
    public double price;
    public int storage;


    public static String brand="Apple", operatingSystem="iOS", madeIn="India",designated="CA";


    public void call(long phoneNum){

        System.out.println("Iphone "+model+" is calling "+phoneNum);
    }

    public static void getIphoneInfo(){

        System.out.println("Brand: "+brand);
        System.out.println("Operating System: "+operatingSystem);
        System.out.println("Made in "+madeIn);
        System.out.println("Designated to "+designated);
    }

    public String toString(){

        return "Brand: "+brand+", Model: "+model+", color: "+color+", Price: "+price+", Operating System: "+operatingSystem;
    }



}
