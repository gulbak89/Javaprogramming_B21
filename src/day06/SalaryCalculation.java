package day06;

public class SalaryCalculation {
    public static void main(String[] args) {
         /*
    salary, stateTaxRate, federalTaxRate, stateTax, federalTax, totalTax, salaryAfterTax
    Your salary is:
    your State Tax is:
    Your federal Tax is:
    your tax is:
    your salary after tax is:
     */


         double salary = 120_000, stateTaxRate = 0.08, federalTaxRate = 0.21, stateTax = salary * stateTaxRate, federalTax = salary * federalTaxRate, totalTax = stateTax + federalTax, salaryAfterTax = salary - totalTax;
        System.out.println("Your salary is $ "+salary);
        System.out.println("Your state tax is $ "+ stateTax);
        System.out.println("Your federal tax is $ "+ federalTax);
        System.out.println("Your total tax is $ "+totalTax);
        System.out.println("Your salary after tax is $ "+salaryAfterTax);


        }
    }

