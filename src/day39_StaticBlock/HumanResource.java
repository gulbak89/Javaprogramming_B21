package day39_StaticBlock;

import day37_CustomClass.Employee;

public class HumanResource {
    public static Employee employee1=new Employee(),employee2=new Employee(),employee3=new Employee(),employee4=new Employee(),employee5=new Employee();


    static{

        employee1.setInfo("Max","Pfizer","Resercher","PZ233","M",60,40);
        employee2.setInfo("Marry","Pfizer","Resercher","PZ465","F",60,40);
        employee3.setInfo("Nancy","Pfizer","Resercher Asistance","PZ132","F",55,40);
        employee4.setInfo("John","Pfizer","Technician","PZ876","M",50,40);
        employee5.setInfo("Sara","Pfizer","Resercher Asistance","PZ089","F",55,40);




    }
}
