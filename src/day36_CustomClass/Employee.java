package day36_CustomClass;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    public String name,ID,jobTitle,companyName;   // instance variables, also known as object variable
    //public String SSN;
    //public String ID;
    //public String jobTitle;
    //public String companyName;

    public char gender;
    public double salary;
    public LocalDate hiredDay;

    public void setInfo(String name, String ID, String jobTitle, String companyName, char gender, double saralry, LocalDate hiredDay){
                              // local variable
        this.name=name;   // this: refers to object
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.companyName=companyName;
        this.gender=gender;
        this.salary=saralry;
        this.hiredDay=hiredDay;


    }

    public void getInfo(){

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DecimalFormat decimal=new DecimalFormat("0.00");
        System.out.println("-------------------------------");
        System.out.println("Company name: "+companyName);
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Hired day: "+hiredDay.format(df));
        System.out.println("ID: "+ID);
        System.out.println(String.format("Salary: &" + decimal.format(salary)));
        System.out.println("-------------------------------");


    }

    public void working(){
        System.out.println(name+" is working");
    }

    public void meeting(){
        System.out.println(name+" is in a meeting");
    }

}
