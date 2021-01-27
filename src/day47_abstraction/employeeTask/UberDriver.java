package day47_abstraction.employeeTask;

public class UberDriver extends Employee {
    public UberDriver(String name, int age, char gender, String ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    void work() {
        System.out.println("Uber driver is driving the customer to the destination");
    }

    @Override
    protected void sleep() {
        System.out.println("Uber driver usually sleeps 9 hours");
    }
}
