package day35_CustumClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class DogPark {

    public static void main(String[] args) {


        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Dog dog3=new Dog();
        Dog dog4=new Dog();
        Dog dog5=new Dog();
        Dog dog6=new Dog();

        dog1.setInfo("Micky","Teddy","Middle","while",LocalDate.of(2018,1,4),'M');
        dog2.setInfo("Alex","Husky","large","grey",LocalDate.of(2017,4,5),'M');
        dog3.setInfo("Missy","Chiwawa","small","brown",LocalDate.of(2016,5,4),'F');
        dog4.setInfo("Gohan","Husky","Middle","balck and white",LocalDate.of(2019,11,11),'F');
        dog5.setInfo("Ate","ShibaInu","Middle","yellow",LocalDate.of(2017,12,4),'M');
        dog6.setInfo("Minnie","Bull dog","small","dark brown",LocalDate.of(2018,5,31),'F');
        System.out.println("================");


        dog1.getInfo();
        dog2.getInfo();
        dog3.getInfo();
        System.out.println("=====================");

        Dog[] dogs={dog1,dog2,dog3,dog4,dog5,dog6};
        ArrayList<Dog> Huskies=new ArrayList<>();
        ArrayList<Dog> Teddies=new ArrayList<>();
        ArrayList<Dog>  other=new ArrayList<>();

        for (Dog each: dogs){
            if(each.breed.equalsIgnoreCase("Husky")){
                Huskies.add(each);
            }else if(each.breed.equalsIgnoreCase("Teddy")){
                Teddies.add(each);
            }else{
                other.add(each);

            }


        }

        System.out.println("Total number of Huskies: "+ Huskies.size());
        System.out.println("Total number of Teddies: "+Teddies.size());




        dog1.eat("Chicken wing");

        dog1.drink("Water");



    }
}
