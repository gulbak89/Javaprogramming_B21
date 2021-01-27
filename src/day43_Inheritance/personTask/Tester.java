package day43_Inheritance.personTask;

public class Tester extends Employee {


    public Tester(String name, char gender, int age, String jobTitle, String ID, double hourlyRate) {
        setInfo(name,gender,age,jobTitle,ID,hourlyRate);
    }


    public void test(){
        System.out.println(jobTitle+" "+name+" is testing");
    }
}
