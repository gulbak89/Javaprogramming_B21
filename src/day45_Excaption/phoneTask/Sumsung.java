package day45_Excaption.phoneTask;

public final class Sumsung extends Phone {

    public Sumsung( String model, double price) {
        super("Sumsung", model, "South Korea", price);
    }

    public void freeze(){
        System.out.println(brand+" "+model+" is freezing");
    }
}
