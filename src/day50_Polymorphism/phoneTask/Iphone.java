package day50_Polymorphism.phoneTask;

public final class Iphone extends Phone implements AppleApps {

    public Iphone( String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if(price>1500){
            throw new RuntimeException("Invalid price, price cannot be more than $1500");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from "+appStoreName);
    }

    @Override
    public void text(long number) {
        System.out.println("Iphone is texting to "+number);
    }

    @Override
    public void call(long number) {
        System.out.println("Iphone is calling "+number);
    }

    public void faceTime(long number){
        System.out.println(" Iphone is faceTiming to "+number);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", OperatingSystem=" + OS +

                '}';
    }
}
