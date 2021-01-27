package day50_Polymorphism;

import day43_Inheritance.carTask.BMW;
import day43_Inheritance.carTask.Toyota;
import day45_Excaption.phoneTask.Iphone;
import day45_Excaption.phoneTask.Nokia;
import day45_Excaption.phoneTask.Phone;
import day46_JavaRecap.CarTask.Car;
import day48_abstraction.animalTask.Animal;
import day48_abstraction.animalTask.Dog;
import day48_abstraction.animalTask.Dolphin;
import day48_abstraction.animalTask.Eagle;
import day49_Abstraction.remoteDriveTask.ChromeDriver;
import day49_Abstraction.remoteDriveTask.JavaScriptExecuter;
import day49_Abstraction.remoteDriveTask.TakeScreenShot;
import day49_Abstraction.remoteDriveTask.WebDriver;
import day49_Abstraction.shapeTask.Circle;
import day49_Abstraction.shapeTask.Cube;
import day49_Abstraction.shapeTask.Cylinder;
import day49_Abstraction.shapeTask.Shape;

public class ReferenceCasting {
    public static void main(String[] args) {

        //primitive casting:
        int a = 100;
        double b = a; // implicit casting: done automatically. casting smaller one to larger one.

        double d = 34;
        int c = (int) d;  //explicit casting: done manually. casting larger to smaller

        System.out.println("=================================");

        Circle circle = new Circle(3);
        Shape shape = circle;  // UpCasting (same as implicit casting): smaller type casted to larger type. done automatically.

        circle= (Circle) shape;  // DownCasting (same as explicit casting)larger type casted to smaller type. done manually.

        Animal animal=new Dog("Ate","Akita","middle",2,'M');

        Dog dog= (Dog) animal; //DownCasting

        ((Dog) animal).swim();   //DownCasting

        Animal animal2=new Dolphin("Cam","white dolphin","large",5,'F');
        ((Dolphin) animal2).swim();
       //  ((Eagle)animal2).hunt();  // it will give class cast exception.

        System.out.println("=============================================");
        Shape shape1=new Cylinder(3,5);
        ((Cylinder) shape1).volume();   //DownCasting

        Cylinder cylinder=(Cylinder) shape1;  //DownCasting

        System.out.println("==============================================");

        day43_Inheritance.carTask.Car car= new Toyota("TX300","white",2020,30000,2300);
        //((BMW)car).race();      // it will give ClassCastException.  because Toyota doesn't have " is a relation" with BMW class.


        System.out.println("===================================================");

        Phone phone=new Nokia("NK",700);
        //((Iphone)phone).faceTime(23482734);  //it will give ClassCastException.  because Nokia doesn't have " is a relation" with Iphone class.

        System.out.println("=======================================");
        WebDriver driver=new ChromeDriver();
        //TakeScreenShot ts=new ChromeDriver();
        //ts.takeScreenShot("pic");

        ( (TakeScreenShot)driver).takeScreenShot("pic");

        ((JavaScriptExecuter)driver).executeScript("djf");

        System.out.println("================================================");

        Shape shape2= new Circle(3);
        //((Cube) shape2).volume();  it gives ClassCastException

        System.out.println("================================================");

        boolean isChrome=driver instanceof ChromeDriver;

        








    }
}