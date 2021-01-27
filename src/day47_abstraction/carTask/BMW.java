package day47_abstraction.carTask;

public class BMW extends Car {

    public BMW( String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println("Call mechanic to start "+brand+" "+model);
    }
}
