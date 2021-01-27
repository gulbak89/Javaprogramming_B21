package day47_abstraction.employeeTask;

public class Tester extends Employee {



    public Tester(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println("Tester is testing the application");
    }

    @Override
    public void sleep() {
        System.out.println("Tester usually sleeps 7 hours");
    }

    public void smokeTesting(){
        System.out.println(jobTitle+" "+name+ " is performing Smoke tasting");
    }


}
