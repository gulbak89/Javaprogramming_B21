package day47_abstraction.carTask;

public class Mercedes extends Car {
    public Mercedes(String model, String color, int year, double price) {
        super("Mercedes", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Push button to start "+brand+" "+model);
    }
}
