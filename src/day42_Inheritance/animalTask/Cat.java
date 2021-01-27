package day42_Inheritance.animalTask;

public class Cat extends Animal {

    public Cat(String name, String breed, char gender, String color, String size, int age){
        setInfo(name,breed,color,size,gender,age);
    }

    public void meow(){
        System.out.println(name+" is meowing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
