package day50_Polymorphism;

import day47_abstraction.employeeTask.Developer;
import day47_abstraction.employeeTask.Employee;
import day47_abstraction.employeeTask.Tester;
import day47_abstraction.employeeTask.UberDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {

    public static void main(String[] args) {

        Employee person1=new Tester("ss",30,'F',"df","tt",110000);
        Employee person2=new Developer("kk",34,'M',"rh","ur",200000);
        Employee person3=new UberDriver("sd",33,'M',"ie","kjf",75000);

        Employee[] employees={person1,person2,person3};

        int numOFTest=0;
        int numOFDeveloper=0;


        for (Employee each: employees){  // instanceof keyword: can verify the which class that objects belongs to, and returns boolean expression.
            if(each instanceof Tester){
                numOFTest++;
            }
            if(each instanceof Developer){
                numOFDeveloper++;
            }
        }

        System.out.println("Number of tester is: "+numOFTest);
        System.out.println("Number of developer is: "+numOFDeveloper);

        System.out.println("===================================");
        ArrayList<Employee> scrumTeam=new ArrayList<>(Arrays.asList(employees));
        System.out.println(scrumTeam.size());

        scrumTeam.removeIf(p->p instanceof UberDriver);

        System.out.println(scrumTeam.size());

        System.out.println("=======================================");

        ArrayList<Employee> testers=new ArrayList<>();
        ArrayList<Employee> developers=new ArrayList<>();

        scrumTeam.forEach(each->{if(each instanceof Tester) testers.add(each); else developers.add(each);
        });





    }
}
