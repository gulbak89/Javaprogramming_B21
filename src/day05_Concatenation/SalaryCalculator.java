package day05_Concatenation;

public class SalaryCalculator {
    /*
    salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax
    Your salary is:
    your State Tax is:
    Your federal Tax is:
    your tax is:
    your salary after tax is:
     */


    public static void main(String[] args) {
        int salary = 120_000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is $"+salary);
        System.out.println("Your state tax is $"+ stateTax);
        System.out.println("Your federal tax is $"+ federalTax);
        System.out.println("Your salary after tax is $"+salaryAfterTax);
        System.out.println();
        System.out.println("=============================================");










    }
}
