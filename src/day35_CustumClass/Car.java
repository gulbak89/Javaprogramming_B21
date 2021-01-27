package day35_CustumClass;

import java.time.LocalDate;

public class Car {

    public  String brand;  // instance variables, opposite of static

    public  String model;

    public String color;

    public double price, mileAge;

    public LocalDate dOfB;

    public int year;


    public void setInfo(String brand, String model, String color, double price, double mileAge, LocalDate dOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileAge = mileAge;
        this.dOfB = dOfB;
        this.year = dOfB.getYear();
    }

    public void getInfo(){

        System.out.println(year+" "+brand+" "+model+" "+color+" "+price);


    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileAge=" + mileAge +
                ", dOfB=" + dOfB +
                ", year=" + year +
                '}';
    }

    public void driver(){

        System.out.println("driving "+brand+" "+model);
    }


}
/*

Car class:
Attributes: instance variables
brand, model, color, price

actions: instance method: object methods, does not have static
drive(), stop()
 */
