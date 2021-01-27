package day48_abstraction.animalTask;

public final class Parrot extends Animal implements Flyable, Playable {

    public Parrot(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }


    @Override
    public void sleep() {
        System.out.println("Parrot sleeps 4 hours");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies 1 hour");
    }

    @Override
    public void play() {
        System.out.println("Parrot talks with human");
    }
}
