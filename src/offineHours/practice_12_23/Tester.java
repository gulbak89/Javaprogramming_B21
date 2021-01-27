package offineHours.practice_12_23;

public class Tester extends Employee{

    public final static boolean isCool;

    static{

        isCool=true;
    }

    public Tester(String name, String ID, String jobTitle, char gender, double salary, boolean isFullTime) {
        super(name, ID, jobTitle, gender, salary,isFullTime);
    }

    public void foundBug(){
        System.out.println(jobTitle+" "+name+" found a bug");
    }


}
