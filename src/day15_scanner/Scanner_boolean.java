package day15_scanner;
import java.util.Scanner;
public class Scanner_boolean {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter true or false");

        boolean b =scan.nextBoolean();

        System.out.println("value: "+b);
        System.out.println("opposite: "+!b);

    }

}
