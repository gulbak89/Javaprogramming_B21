package day41_Encapsulation;

public class PersonObject {

    public static void main(String[] args) {


        Person p1=new Person("Mike",28,'M');

        System.out.println(p1.getAge());

        p1.setAge(30);

        System.out.println(p1.getAge());


        Person p2=new Person("Sara",29,'F');
        System.out.println(p2.getName());



    }
}
