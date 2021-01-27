package day40_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryCalculator {
    public static int  numOfWeeks;

    public double weeklyHours,hourlyRate, stateTaxRate, federalTaxRate, salary, totalTax,salaryAfterTax;

    static {
        numOfWeeks=52;

    }

    public SalaryCalculator(double weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = (stateTaxRate>1)?stateTaxRate/100:stateTaxRate;
        this.federalTaxRate = (federalTaxRate>1)?federalTaxRate/100:federalTaxRate;
        salary = weeklyHours*hourlyRate*numOfWeeks;
        totalTax = salary*this.stateTaxRate+salary*this.federalTaxRate;
        salaryAfterTax=salary-totalTax;
    }


    @Override
    public String toString() {
        return "SalaryCalculator{" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary=" + salary +
                ", totalTax=" + totalTax +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }
}


class Offers{

    public static void main(String[] args) {

        SalaryCalculator salary1= new SalaryCalculator(40,55,12,10);
        SalaryCalculator salary2=new SalaryCalculator(40,50,12,8);

        System.out.println(salary1);
        System.out.println(salary2);

        ArrayList<SalaryCalculator> salaryList=new ArrayList<>(Arrays.asList(salary1,salary2));

        double max=salaryList.get(0).salaryAfterTax;
        double maxTotalTax=salaryList.get(0).totalTax;


        for (SalaryCalculator each: salaryList){
           max=Math.max(each.salaryAfterTax,max);
           maxTotalTax=Math.max(each.totalTax,maxTotalTax);
            }
        System.out.println("Maximum salary after tax: "+max);
        System.out.println("Maximum total tax: "+maxTotalTax);

        System.out.println("==================================");















    }
}
