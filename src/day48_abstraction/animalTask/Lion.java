package day48_abstraction.animalTask;

public final class Lion extends Animal implements Predator {

    public Lion(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps 12 hours a day");
    }

    @Override
    public void hunt() {
        System.out.println("hunts animals");

    }
}
