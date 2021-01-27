package day48_abstraction.animalTask;

public abstract class Animal {

    public String name, breed, size;
    public int age;
    public final char gender;

    public Animal(String name, String breed, String size, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }


    public abstract void sleep();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
