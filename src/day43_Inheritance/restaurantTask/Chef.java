package day43_Inheritance.restaurantTask;

import day43_Inheritance.personTask.Employee;

public class Chef extends Employee {

    public Chef(String name, char gender, int age, String jobTitle, String ID, double hourlyRate){

        setInfo(name,gender,age,jobTitle,ID,hourlyRate);

    }

    public void makeOrder(){
        System.out.println(jobTitle+" "+name+" is making order");
    }







}
