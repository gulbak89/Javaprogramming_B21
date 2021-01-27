package day37_CustomClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {

    public String name,ID;
    public LocalDate dOB;
    public int age;
    public char gender;
    public double gpa;


    public void setInfo(String name, char gender, LocalDate dOB, String ID, double gpa){

        this.name=name;
        this.gender=gender;
        this.dOB=dOB;
        age=LocalDate.now().getYear()-dOB.getYear();
        this.ID=ID;
        this.gpa=gpa;

    }


    @Override
    public String toString() {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", dOB=" + dOB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }
}
