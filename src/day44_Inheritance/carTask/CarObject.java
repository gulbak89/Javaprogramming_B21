package day44_Inheritance.carTask;

public class CarObject {

    public static void main(String[] args) {

        Toyota toyota=new Toyota("Corolla","blue",35000,2019);
        toyota.start();
        System.out.println(toyota);

        Mercedes mercedes=new Mercedes("M35","black",45000,2019);
        mercedes.start();
        System.out.println(mercedes);

        Tesla tesla=new Tesla("Tx","dark grey",60000,2018);
        tesla.start();
        System.out.println(tesla);

        Jeep jeep=new Jeep("Cherokee","green",48000,2018);
        jeep.start();
        System.out.println(jeep);

    }
}
