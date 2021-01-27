package day38_staticKeyword;

public class SaraltyCalculator {

    public double hourlyRate, weeklyHour, stateTaxRate, federaltaxRate, salary,salrayAfterTax;


    public void setInfo(double hourlyRate, double weeklyHour, double stateTaxRate, double federaltaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = (stateTaxRate>1)? stateTaxRate/100:stateTaxRate;
        this.federaltaxRate = (federaltaxRate>1)? federaltaxRate/100:federaltaxRate;
        salary = calculateSalary();
        salrayAfterTax = calculateSalaryAfterTax();
    }

    public double calculateSalary(){

        return hourlyRate*weeklyHour*52;
    }

    public double calculateStateTax(){

        return calculateSalary()*stateTaxRate;
    }


    public double calculateFederalTax(){


        return calculateSalary()*federaltaxRate;
    }


    public double calculateSalaryAfterTax(){

        return calculateSalary()-calculateFederalTax()-calculateStateTax();
    }

    @Override
    public String toString() {
        return "SaraltyCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", salary=" + salary +
                ", salrayAfterTax=" + salrayAfterTax +
                '}';
    }

    public boolean equals(SaraltyCalculator s){

        if(this.salary==s.salary){
            return true;
        }else{
            return false;
        }
    }
}
