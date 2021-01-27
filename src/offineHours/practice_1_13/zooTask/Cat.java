package offineHours.practice_1_13.zooTask;

public final class Cat extends Animal {

    public Cat( String breed, String color, String size, int age, char gender) {
        super("Cat", breed, color, size, age, gender);
    }

    public void scratch(String object){
        System.out.println("scratching "+object);
    }

    @Override
    protected void speak() {
        System.out.println("Meeeooow!");
    }

    @Override
    protected void play() {
        System.out.println("Play with jerry");
    }

    @Override
    public String toString() {
        return "Cat"+super.toString();
    }
}
