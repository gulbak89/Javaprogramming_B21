package offineHours.practice_12_23;

public class BA extends Employee{

    public BA(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, ID, "Business analyst", gender, salary, isFullTime);
    }

    public void talkToClient(){
        System.out.println(jobTitle+" "+name+" is talking to client");
    }
}
