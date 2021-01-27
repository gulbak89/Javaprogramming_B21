package day38_staticKeyword.scrumTask;

public class Developers {

    public String name, ID, JobTitle, companyName;
    public double salary;
    public char gender;

    public static boolean hasCodingSkills=true;

    public void setInfo(String name, String ID, String jobTitle, String companyName, double salary, char gender) {
        this.name = name;
        this.ID = ID;
        this.JobTitle = jobTitle;
        this.companyName = companyName;
        this.salary = salary;
        this.gender = gender;
    }

    public void coding(){
        System.out.println(JobTitle+" "+name+" is coding");
    }

    public void fixingBug(){

        System.out.println(JobTitle+" "+name+" is fixing bugs");
    }

    public void crying(){
        System.out.println(JobTitle+" "+name+" is crying");
    }

    @Override
    public String toString() {
        return "Developers{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", JobTitle='" + JobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
