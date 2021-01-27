package day16_Scanner2;
import java.util.Scanner;
public class Scanner_countUpPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int point = 0;

        System.out.println("How many people are you living with?");
        int people=input.nextInt();


        if(people<=2 && people>0) {

            System.out.println("You live with less than 2 people");
            point++;   // point+=1

        }else if( people<7){
            System.out.println("You live with 3-6 people ");

            point+=2;

        }else if(people<=12){
            System.out.println("You live with 7-12 people");

            point+=3;
        }else{
            System.out.println("invalid number of people");
        }

        System.out.println("points: "+point);

        System.out.println("What city you are living in?");





    }
}
