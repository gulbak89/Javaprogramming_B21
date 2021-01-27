package offineHours.practice_12_23;

public class ScrumMaster extends Employee{



    public ScrumMaster(String name, String ID, char gender, double salary, boolean isFullTime) {
        super(name, ID, "Scrum Master", gender, salary, isFullTime);
    }

    public void organizeMeeting(){
        System.out.println(jobTitle+" "+name+" is organizing meeting");
    }
}
