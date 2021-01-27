package day42_Inheritance.animalTask;

public class Animal {

    public String breed, color, name, size;
    public char gender;
    public int age;

    public void setInfo(String name, String breed, String color, String size, char gender, int age) {//constructor cannot be inheritance
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drink(String drinks){
        System.out.println(name+" is drinking "+drinks);
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
