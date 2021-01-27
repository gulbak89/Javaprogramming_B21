package day50_Polymorphism;

import day42_Inheritance.animalTask.Animal;
import day42_Inheritance.animalTask.Dog;
import day46_JavaRecap.CarTask.Tesla;
import day49_Abstraction.shapeTask.Cube;
import day49_Abstraction.shapeTask.Shape;

public class PolymorphismRules {
    public static void main(String[] args) {

        Dog dog=new Dog("Rex","GS",'M',3,"brown","large");
        dog.bark();

        Animal animal=new Dog("Ate","Akita",'F',2,"black","small");//reference type is the one that decide which method we can call. so here we cannot call .bark() method. because the reference is Animal. The object "Dog" decides which implementation gets executed.

        animal.eat("dog food");

        Shape shape=new Cube(1);
        Cube cube=new Cube(1);

        System.out.println(shape.area());
        System.out.println(shape.perimeter());
        //System.out.println(shape.volume());    reference type is Shape, and Shape doesn't have volume method. if we call the volume(), it will give us compile error.


        System.out.println(cube.area());
        System.out.println(cube.perimeter());
        System.out.println(cube.volume());

        System.out.println("======================================");

        Animal animal2=new Dog("Lucy","Chiwawa",'F',5,"yellow","small");

        ((Dog) animal2).bark();  // Reference/Class casting:  UpCasting & DownCasting











    }
}
