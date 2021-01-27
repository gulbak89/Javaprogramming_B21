package day48_abstraction.animalTask;

public final class Eagle extends Animal implements Predator,Flyable  {

    public Eagle(String name, String breed, String size, int age, char gender) {
        super(name, breed, size, age, gender);
    }

    @Override
    public void sleep() {
        System.out.println("Eagle sleeps on the tree");
    }

    @Override
    public void hunt() {
        System.out.println("hunts small animals and fish");
    }

    @Override
    public void fly() {
        System.out.println("Eagles flies very high");
    }
}
