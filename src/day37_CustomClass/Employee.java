package day37_CustomClass;

public class Employee {

    public String name, companyName, jobTitle, ID, gender;
    public double hourlyRate, salary;
    public int weeklyhour;


    public void setInfo(String name, String companyName, String jobTitle, String ID, String gender, double hourlyRate, int weeklyhour) {
        this.name = name;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.hourlyRate = hourlyRate;
        this.weeklyhour = weeklyhour;
        this.salary = calculateSalary();
    }




    public double calculateSalary(){

        return hourlyRate*weeklyhour *52;

    }

    public double calculateTax(double stateTax, double federalTax){

        return calculateSalary()*stateTax+calculateSalary()*federalTax;

    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jonTitle='" + jobTitle + '\'' +
                ", ID='" + ID + '\'' +
                ", gender='" + gender + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", weeklyhour=" + weeklyhour +
                '}';
    }
}
