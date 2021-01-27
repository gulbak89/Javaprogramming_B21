package day41_Encapsulation;

public class Person {

    private String name;
     private int  age;
    private char  gender;
 //private final char gender;  final variable cannot have setter
    // Interview question: if you we 5  data, and two of them are constant(meaning final variable), we can generate 5 getter, 3 setter.

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public char getGender(){
        return gender;
    }



    public String getName() {
        return name;
    }



    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
