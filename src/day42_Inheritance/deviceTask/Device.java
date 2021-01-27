package day42_Inheritance.deviceTask;

public class Device {
    public String deviceName, brand, model;
    public double price;

    public static String madeIn;
    public static boolean hasBattery, hasPwerButton;

    static {
        madeIn="Japan";
        hasBattery=true;
        hasPwerButton=true;

    }

    public void setInfo(String deviceName, String brand, String model, double price) {
        this.deviceName=deviceName;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void turnOn(){
        System.out.println("Turning on "+brand+" "+model);
    }

    public void turnOff(){
        System.out.println("Turning off "+brand+" "+model);
    }

    @Override
    public String toString() {
        return "Device{" +
                "deviceName='" + deviceName + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                '}';
    }
}
