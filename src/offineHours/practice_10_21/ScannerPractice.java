package offineHours.practice_10_21;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter you score");
        int score = scan.nextInt();
        scan.close();

        char grade=' ';

        if(score>=0 && score<=100){
           /* if(score>=90){
                grade='A';
            }else if(score>=80){
                grade='B';
            }else if(score>=70){
                grade='C';
            }else if(score>=60){
                grade='D';
            }else{
                grade='F';
            }:*/

            grade=(score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';

        }else{
            System.out.println("Invalid score");
        }






        System.out.println("Your grade is: "+grade);


    }





}
/*
A: 90-100
B: 89-89
C: 70-79
D: 60-69
F: 0-59
 */
