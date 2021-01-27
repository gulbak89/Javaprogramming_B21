package day43_Inheritance.carTask;

public class Car {

    public String brand,model,color, madeIn;
    public int year, miles;
    public double price;
    public static boolean hasEngine, hasWheel, hasTires;

    static {
        hasEngine=true;
        hasWheel=true;
        hasTires=true;
    }


    public void setInfo(String brand, String model, String color, String madeIn, int year, double price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.madeIn = madeIn;
        this.year = year;
        this.price = price;
        this.miles=miles;
    }

    public void drive(){
        System.out.println("driving "+brand+" "+model);
    }

    public void park(){
        System.out.println("parking "+brand+" "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", miles= "+miles+
                '}';
    }
}
