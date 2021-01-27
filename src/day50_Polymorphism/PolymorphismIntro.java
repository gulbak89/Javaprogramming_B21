package day50_Polymorphism;

import day49_Abstraction.remoteDriveTask.ChromeDriver;
import day49_Abstraction.remoteDriveTask.FireFox;
import day49_Abstraction.remoteDriveTask.WebDriver;
import day49_Abstraction.shapeTask.Circle;
import day49_Abstraction.shapeTask.Rectangle;
import day49_Abstraction.shapeTask.Shape;
import day49_Abstraction.shapeTask.Square;
import day50_Polymorphism.phoneTask.Iphone;
import day50_Polymorphism.phoneTask.Phone;
import day50_Polymorphism.phoneTask.SamSung;

import java.util.ArrayList;

public class PolymorphismIntro {// object behave in different forms. parent can be reference to the child.

    public static void main(String[] args) {

        //Iphone iphone=new Iphone("Iphone12","big","white",1350);
        //SamSung samSung =new SamSung("Galaxy S20","big","black",1150);

        Phone phone1=new SamSung("Galaxy S20","middle","white",999);
        Phone phone2=new Iphone("Iphone12 pro","big","Black",1450);

        ArrayList<Phone> phones=new ArrayList<>();
      phones.add(phone2);
      phones.add(phone1);



      Shape shape;

      shape=new Circle(2.5);

        System.out.println(shape.area());

        shape=new Rectangle(3,4);
        System.out.println(shape.area());

        System.out.println("=======================================");

        String browserName="chrome";

        WebDriver driver;

        switch (browserName){

            case "fireFox":
                driver=new FireFox();
                break;

            case "chrome" :
                driver=new ChromeDriver();
                break;

            default:
                throw  new RuntimeException("Invalid browser name");

        }



    }

}
