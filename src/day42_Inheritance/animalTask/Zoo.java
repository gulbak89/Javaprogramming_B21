package day42_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger1=new Tiger("Sircull","African","orange","large",'M',5);
        System.out.println(tiger1);

        tiger1.hunt();
        tiger1.roar();
        tiger1.drink("water");
        tiger1.eat("chicken");

        Cat cat1=new Cat("Mimi","British ShortHair",'F',"blue","small",1);
        System.out.println(cat1);
        cat1.meow();
        cat1.drink("milk");
        cat1.eat("fish");

        Dog dog1=new Dog("Natasha","Chiwawa",'F',6,"brown","mini");
        dog1.eat("chicken wing");
        dog1.bark();

    }
}
