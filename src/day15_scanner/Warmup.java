package day15_scanner;

public class Warmup {
    public static void main(String[] args) {

        int numOfPeople =50;
        int crew = 0;
        int passenger = 1;

        switch(numOfPeople) {

            case 50: crew= 20;
                     passenger = 30;
                     break;

            case 75: crew= 25;
                     passenger= 50;
                      break;


            case 100: crew=30;
                      passenger=70;
                      break;

            default:
                System.out.println("Invalid number of people");



        }

        System.out.println("crew : "+crew);
        System.out.println("passenger : "+passenger);
    }
}
