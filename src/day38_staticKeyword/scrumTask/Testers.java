package day38_staticKeyword.scrumTask;

public class Testers {

   public String name, ID, jobTitle,companyName;
   public double salary;
   public char gender;


    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void smokeTest(){
        System.out.println(name+" is performing smoke testing");
    }

    public void createTicket(){
        System.out.println(name+" is creating ticket");
    }

    @Override
    public String toString() {
        return "Testers{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
