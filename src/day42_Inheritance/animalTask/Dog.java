package day42_Inheritance.animalTask;

public class Dog extends Animal {

    public Dog(String name, String breed , char gender, int age,String color, String size){

        setInfo(name,breed,color,size,gender,age);
    }

    public void bark(){

        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

class dogObject{
    public static void main(String[] args) {

        Dog dog1=new Dog("Rex","German Sheperd",'M',3,"Dark blue","big");


        dog1.sleep();

    }


}
