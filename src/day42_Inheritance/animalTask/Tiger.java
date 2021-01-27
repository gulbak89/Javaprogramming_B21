package day42_Inheritance.animalTask;

public class Tiger extends Animal {

    public Tiger(String name, String breed, String color,String size, char gender, int age){
        setInfo(name,breed,color,size,gender,age);
    }

    public void hunt(){
        System.out.println(name+" is going after the prey");
    }

    public void roar(){
        System.out.println(name+" is roaring");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
