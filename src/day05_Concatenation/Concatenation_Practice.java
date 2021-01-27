package day05_Concatenation;

public class Concatenation_Practice {
    public static void main(String[] args) {

        String streetName = "HillTop Dr";
        int houseNumber = 350;
        String cityName = "King of Prussia";
        String state = "PA";
        int ZipCode = 19406;
        String FullAddress = houseNumber + " "+ streetName+ ", "+cityName+", "+state+ ", "+ ZipCode;
        System.out.println(FullAddress);

        System.out.println("===================================");

        String brand = "Farrari";
        String model = "F430";
        int year = 2019;
        byte mileAge = 50;
        double price = 1800000000;
        String color = "blue and white";
        String CarInfo = year+ " "+ brand+ " "+ model+ ", "+ mileAge+ " miles, "+ color+ ", $"+ price; // concatenation
        System.out.println(CarInfo);


        // printout  as: 2010 Toyota Camry, 60000, blue, 18000







    }
}
