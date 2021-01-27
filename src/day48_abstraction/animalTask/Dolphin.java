package day48_abstraction.animalTask;

public final class Dolphin extends Animal implements Swimable,Playable {

    public Dolphin(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }

    @Override
    public void sleep() {
        System.out.println("Dolphin sleeps  11 hours");
    }

    @Override
    public void play() {
        System.out.println("Dolphin likes to play with human");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin swims 10 hours");
    }
}
