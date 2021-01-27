package day37_CustomClass;

public class BankOfAmerica {

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setInfo("Max","Bank Of America","QA","BA786","M",40,40);

        System.out.println(employee1);

        double totalTax=employee1.calculateTax(0.05,0.22);

        System.out.println(totalTax);

        System.out.println(employee1.salary-totalTax);







    }
}
