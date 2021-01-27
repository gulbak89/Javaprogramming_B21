package day43_Inheritance.restaurantTask;

import day43_Inheritance.personTask.Employee;

public class Server extends Employee {

    public Server(String name, char gender, int age, String jobTitle, String ID, double hourlyRate){
        setInfo(name,gender,age,jobTitle,ID,hourlyRate);

    }

    public void serving(){
        System.out.println(jobTitle+name+" is serving the table");
    }

    public void takeOrder(){
        System.out.println(jobTitle+name+" is taking order");
    }


}
