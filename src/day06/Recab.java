package day06;

public class Recab {

    public static void main(String[] args) {

        int kg = 20;
        double pound = kg * 2.20462;

        double gallon = 120.5;
        double litter = gallon * 3.78541;
        boolean exceeded300liter = litter > 300;

        double lira = 1000;
        double USDollar = lira * 0.13;
        boolean exceeded500USDollar = USDollar> 500;


        System.out.println(kg+"kg equals to "+pound+" pounds");

        System.out.println(gallon+ "gallon exceeded 300 liters is: "+ exceeded300liter);

        System.out.println(lira+"lira is equal to "+USDollar+" US Dollar");
        System.out.println(lira+"lira exceeded 500 USDollar is "+exceeded500USDollar);
    }
}
