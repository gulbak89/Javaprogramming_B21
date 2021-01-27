package day43_Inheritance.personTask;

public class Developer extends Employee {


    public Developer(String name, char gender, int age, String jobTitle, String ID, double hourlyRate) {
        setInfo(name,gender,age,jobTitle,ID,hourlyRate);
    }

    public void code(){
        System.out.println(jobTitle+" "+name+" is coding");
    }
}
