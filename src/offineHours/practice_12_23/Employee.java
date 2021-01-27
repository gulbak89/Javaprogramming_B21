package offineHours.practice_12_23;

public class Employee {

    public String name, ID, jobTitle;
    public char gender;
    public double salary;
    public boolean isFullTime;

    public Employee(String name, String ID, String jobTitle, char gender, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
