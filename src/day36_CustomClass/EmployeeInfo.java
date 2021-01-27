package day36_CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeInfo {  //Class EmployeeInfo has relation with Class Employee
    public static void main(String[] args) {

        Employee[] employees={new Employee(),new Employee(),new Employee()};

        employees[0].setInfo("Daniel","Y123-98","SDET","Google",'M',140000,LocalDate.of(2015,4,1));
        employees[1].setInfo("Monica","X186-02","Developer","Google",'F',200000,LocalDate.of(2016,9,5));
        employees[2].setInfo("John","Y334-768","QA","Google",'M',130000,LocalDate.of(2017,4,9));

       for (Employee each: employees){
           each.getInfo();
       }

        System.out.println("=========================================");

        ArrayList<Employee> SdetAndDev=new ArrayList<>(Arrays.asList(employees));

        SdetAndDev.removeIf(p->!(p.jobTitle.equalsIgnoreCase("sdet") || p.jobTitle.equalsIgnoreCase("developer")));
        //                        removes the employees if the jopTitle of the employees are not "SDET" or not "Developer"


        for(Employee each:SdetAndDev){
            System.out.println(each.name+" "+each.jobTitle);
        }

        System.out.println("======================================");
        ArrayList<Employee> richPeople=new ArrayList<>(Arrays.asList(employees));

        richPeople.removeIf(p->p.salary<200000);

        for (Employee each: richPeople){
            System.out.println(each.name+" "+each.salary);
        }

        System.out.println("=============================");

        double maxSalary=employees[0].salary;
        String RichName="";

        for(Employee each: employees){
            if(each.salary>maxSalary){
                maxSalary=each.salary;
                RichName=each.name;
            }
        }

        System.out.println(RichName+" "+maxSalary);




    }






}
