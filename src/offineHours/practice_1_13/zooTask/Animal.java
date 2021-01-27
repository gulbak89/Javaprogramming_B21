package offineHours.practice_1_13.zooTask;

public abstract class Animal {

    public String name,color,size;
    public final String breed;
    public int age;
    public final char gender;
    public static boolean isAnimal;
    static{
        isAnimal=true;
    }

    public Animal(String name, String breed, String color, String size, int age, char gender) {
        this.name = name;
        this.breed=breed;
        this.color = color;
        this.size = size;
        this.age = age;
        this.gender = gender;
    }

    protected abstract void speak();
    protected abstract void play();


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
