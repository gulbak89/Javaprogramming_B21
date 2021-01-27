package day48_abstraction.animalTask;

public final class Shark extends Animal implements Predator,Swimable {

    public Shark(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }



    @Override
    public void sleep() {
        System.out.println("Shark sleeps 3 hours");
    }

    @Override
    public void hunt() {
        System.out.println("Hunts fish");
    }

    @Override
    public void swim() {
        System.out.println("Shark swims 20 hours");
    }
}
