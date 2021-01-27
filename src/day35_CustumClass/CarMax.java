package day35_CustumClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class CarMax {

    public static void main(String[] args) {

        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();
        Car car5=new Car();


        car1.setInfo("Toyota","Corolla"," black",25000,120000,LocalDate.of(2017,7,5));
        car2.setInfo("Honda","Civic","Silver",23000,20000,LocalDate.of(2016,4,6));
        car3.setInfo("Nissan","GT-R","white",60000,40000,LocalDate.of(2015,4,6));
        car4.setInfo("Ford","F150","black",50000,30000,LocalDate.of(2019,4,5));
        car5.setInfo("Tesla","ModelX","grey",75000,23000,LocalDate.of(2019,1,1));

        //car1.getInfo();
        //car2.getInfo();
        //car3.getInfo();
        //car4.getInfo();
        //car5.getInfo();


        Car[]  cars= {car1,car2,car3,car4,car5};

        ArrayList<Car> carList=new ArrayList<>(Arrays.asList(cars));

        carList.removeIf(p->p.price<25000);

        for (int i=0; i<=carList.size()-1; i++){

            carList.get(i).getInfo();
        }

        System.out.println("===========================");

        ArrayList<Car> recallList=new ArrayList<>();
        for (Car each: carList){

            if(each.year<2017){
                recallList.add(each);
            }

        }

        System.out.println(recallList);

        System.out.println("=============================");
        ArrayList<Car> recall2=new ArrayList<>();

        for (Car each: carList){
            if(each.brand.equalsIgnoreCase("toyota")){
                if(each.model.equalsIgnoreCase("Corolla") && each.year<2018){
                    recall2.add(each);
                }
            }
        }

        System.out.println(recall2);

        System.out.println("=======================");
       ArrayList<Car> myCollection=new ArrayList<>(carList);

       myCollection.removeIf(p->!(p.brand.equalsIgnoreCase("honda")&&p.model.equalsIgnoreCase("civic")));
        System.out.println(myCollection);
















    }
}
