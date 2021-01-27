package day50_Polymorphism.phoneTask;

public abstract class Phone {
    public String brand,model, size,color;
    public double price;

    public Phone(String brand, String model, String size, String color, double price) {
        if(price<0){
            throw new RuntimeException("Invalid Price! price cannot be negative");
        }
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public abstract void text(long number);

    public abstract void call(long number);

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=$" + price +
                '}';
    }
}
