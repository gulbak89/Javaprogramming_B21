package day16_Scanner2;
import java.util.Scanner;
public class Scanner_close {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int num = input.nextInt();

        input.close(); //after closing, we can not using scanner again



    }
}
