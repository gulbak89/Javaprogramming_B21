package day18_String;

import java.util.Scanner;

public class StringPractice_2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter the Item you want");

        String item= scan.nextLine();

        item = item.replace(" ","").toLowerCase(); // removes allthe

        switch(item){
            case "macbook":
                System.out.println("Which version of MacBook would you like?");
                String model= scan.nextLine();
                if(model.equalsIgnoreCase("air")){
                    System.out.println("MacBook Air is 2400$");
                }else if(model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook Pro is 2500$");
                }else{
                    System.err.println("There is no such a model");
                }


                break;
            case "iphone" :
                System.out.println("Which version of Iphone would you like?");
                String model2=scan.nextLine();
                if(model2.equalsIgnoreCase("12")){
                    System.out.println("Iphone 12 is 1000$");
                }else if(model2.equalsIgnoreCase("11")){
                    System.out.println("Iphone 11 is 900$");
                }else if(model2.equalsIgnoreCase("9")){
                    System.out.println("Iphone 9 is 800$");
                }else if(model2.equalsIgnoreCase("8")){
                    System.out.println("Iphone 8 is 700$");
                }else{
                    System.err.println("There is no such model");
                }
                break;


            case "ipad" :
                System.out.println("Which model would you like?");
                String model3=scan.nextLine().toLowerCase();
                switch(model3){

                    case("air"):
                        System.out.println("Ipad Air is 500$");
                        break;
                    case("mini"):
                        System.out.println("Ipad Mini is 300$");
                        break;
                    case("pro")  :
                        System.out.println("Ipad Pro is 400$");
                        break;
                    default:
                        System.err.println("There is no such model");

                }



                break;

            default:
                System.err.println("Invalid Product Name");













        }






    }
}


/*

Macbook: 2700
Iphone:
12: 1000
11: 900
10: 800
8: 700

Ipad:
air:500
mini: 400
pro:300
 */
