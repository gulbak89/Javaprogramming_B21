package day47_abstraction.employeeTask;

public class Developer extends Employee {

    public Developer(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    void work() {
        System.out.println("Developer is writing codes");
    }

    @Override
    protected void sleep() {
        System.out.println("Developer usually sleeps 6 hours");
    }
}
