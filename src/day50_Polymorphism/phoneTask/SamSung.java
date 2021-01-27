package day50_Polymorphism.phoneTask;

public final class SamSung extends Phone implements AndroidApps {

    public SamSung( String model, String size, String color, double price) {
        super("SamSung", model, size, color, price);
        if(price>1200){
            throw new RuntimeException("Price cannot be more than $1200");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading Apps from "+appStoreName);
    }

    @Override
    public void text(long number) {
        System.out.println("SamSung is texting to "+number);
    }

    @Override
    public void call(long number) {
        System.out.println("SamSung is calling "+number);
    }

    @Override
    public String toString() {
        return "SamSung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                ", OperatingSystem=" + OS+
                '}';
    }
}
