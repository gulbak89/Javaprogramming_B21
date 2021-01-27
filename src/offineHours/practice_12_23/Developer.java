package offineHours.practice_12_23;

public class Developer extends Employee{



    public Developer(String name, String ID, String jobTitle, char gender, double salary, boolean isFullTime) {
        super(name, ID, jobTitle, gender, salary, isFullTime);
    }

    public void fixingBud(){
        System.out.println(jobTitle+" "+name+" is fixing bug");
    }
}
