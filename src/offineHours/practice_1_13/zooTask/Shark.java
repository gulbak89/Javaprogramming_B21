package offineHours.practice_1_13.zooTask;

public final class Shark extends Animal {

    public Shark( String breed, String color, String size, int age, char gender) {
        super("Shark", breed, color, size, age, gender);
    }

    public void hunt(){
        System.out.println("hunting small fishes");
    }

    @Override
    protected void speak() {
        System.out.println("du du du durut");
    }

    @Override
    protected void play() {
        System.out.println("Play in the water");
    }

    @Override
    public String toString() {
        return "Shark"+ super.toString();
    }
}
