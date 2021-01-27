package offineHours.practice_1_13.zooTask;

public final class Dog extends Animal {

    public Dog( String breed, String color, String size, int age, char gender) {
        super("Dog", breed, color, size, age, gender);
    }

    public void bark(int times){
        System.out.println("barking "+times+" times");
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof!");
    }

    @Override
    protected void play() {
        System.out.println("Play with the kids");
    }

    @Override
    public String toString() {
        return "Dog"+super.toString();
    }
}
