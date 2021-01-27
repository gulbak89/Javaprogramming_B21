package day43_Inheritance.personTask;

import java.text.DecimalFormat;

public class Employee extends Person {

    public String jobTitle,ID;
    public double hourlyRate;


   public void setInfo(String name, char gender, int age, String jobTitle, String ID, double hourlyRate){

       setInfo(name,gender,age);
       this.jobTitle=jobTitle;
       this.ID=ID;
       this.hourlyRate=hourlyRate;
   }


    public void work(){
        System.out.println(name+" is working");
    }

    public double calSalary(){
       return hourlyRate*40*52;
    }



    @Override
    public String toString() {

        return "Employee{" +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                "jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", hourlyRate= $" + hourlyRate +
                ", salary= $"+calSalary()+

                '}';
    }

    public static String publicVariable="Public";

   protected static String protectedVariable="Protected";

   static String defaultVariable="Default";  // outside the package it cannot be reached.

}
