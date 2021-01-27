package day46_JavaRecap.CarTask;

public class CarMax {
    public static void main(String[] args) {

        Mercedes mercedes=new Mercedes("S600","pink",2021,500000);

        Lexus lexus=new Lexus("RX 350","blue",2018,45000);

        BMW bmw = new BMW("X6","white",2019,60000);

        Tesla tesla=new Tesla("Model Y","Black",2019, 65000);

        mercedes.start();
        lexus.start();
        bmw.start();
        tesla.start();

        System.out.println("=============================");

        mercedes.drive();
        bmw.drive();
        lexus.drive();
        tesla.drive();

        System.out.println("========================");
        tesla.autoPilot();
        bmw.autoPark();











    }
}
