package day48_abstraction.animalTask;

public final class Dog extends Animal implements Playable,Swimable {

    public Dog(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 6 hours a day");
    }

    @Override
    public void play() {
        System.out.println("Dog likes to play with human");
    }

    @Override
    public void swim() {
        System.out.println("Dog swims 10 minutes");
    }
}
