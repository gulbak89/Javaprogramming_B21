package day47_abstraction.employeeTask;

public class EmployeeObject {

    public static void main(String[] args) {


        Tester tester=new Tester("Sara",35,'F',"t341","QA",120000);
        Developer developer=new Developer("Nancy",38,'F',"d356","softWare engineer",160000);
        UberDriver uberDriver=new UberDriver("Max",42,'M',"u291","driver",70000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(uberDriver);

        tester.smokeTesting();
        tester.sleep();
    }
}
