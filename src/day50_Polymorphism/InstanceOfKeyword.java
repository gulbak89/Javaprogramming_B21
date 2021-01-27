package day50_Polymorphism;

import day48_abstraction.animalTask.Animal;
import day48_abstraction.animalTask.Dog;
import day48_abstraction.animalTask.Dolphin;

public class InstanceOfKeyword {
    public static void main(String[] args) {

        Animal animal=new Dog("xx","yy","small",3,'f');

        boolean  isDog=animal instanceof Dog;
        boolean isDolphin=animal instanceof Dolphin;
        boolean isAnimal=animal instanceof Animal;

        System.out.println(isDog);
        System.out.println(isDolphin);
        System.out.println(isAnimal);

        if(animal instanceof Dog){
            System.out.println(animal+" is Dog");
        }else{
            System.out.println(animal +" is not dog");
        }
    }
}
