package day35_CustumClass;

import java.time.LocalDate;

public class CarObject {
    public static void main(String[] args) {


        Car car1=new Car();  // has own brand
        Car car2=new Car();  // has own brand
        Car car3=new Car();  // has own brand

        car1.brand="Toyota";
        car2.brand="Honda";
        car3.brand="Ford";

        System.out.println(car1.brand);
        System.out.println(car2.brand);
        System.out.println(car3.brand);


        car1.model="Corolla";
        car2.model="Civic";
        car3.model="F150";

        System.out.println(car1.model);
        System.out.println(car2.model);
        System.out.println(car3.model);





        Car car4=new Car();

        System.out.println(car4.brand);
        System.out.println(car4.model);

        car4.setInfo("Nissan","Polo","blue",15000,24000,LocalDate.of(2019,3,5));

        System.out.println(car4.year+" "+car4.brand+" "+car4.model+" "+car4.color+" "+car4.price);

       car4.getInfo();




    }
}
