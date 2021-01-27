package day14;

public class If_Practice {

    public static void main(String[] args) {

        int a =3;
        String result ="";
        if(a%2==0) {
            result= "even";

        }else {
            result="odd";
        }

        System.out.println(result);


        System.out.println("=============================================");

        int age =15;
        if(age>=18){
            System.out.println("eligible to get driver licence");
        }else {
            System.out.println("Not eligible to get a driver licence");
        }

        System.out.println("=================================================");

        char grade = 'A';
        if(grade=='A' || grade=='B' || grade=='C'){
            System.out.println("passed the exam");
        }else {
            System.out.println("failed the exam");
        }

        System.out.println("=====================================================");

        int n1 =100;
        int n2 = 100;

        if(n1>n1) {
            System.out.println(n1+" is greater than "+n2);
        }else if(n2>n1) {
            System.out.println(n2+" is greater than "+n1);
        }else {
            System.out.println(n1+" is equal to "+n2);
        }

        System.out.println("====================================================");

        int num =1;
        if(num==1){
            System.out.println("Monday");
        }else if(num==2){
            System.out.println("Tuesday");
        }else if(num==3){
            System.out.println("Wednesday");
        }else if(num==4) {
            System.out.println("Thursday");
        }else if(num==5) {
            System.out.println("Friday");
        }else if(num==6) {
            System.out.println("Saturday");
        }else if(num==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("invalid input");
        }


        System.out.println("===============================================");

        int AGE =40;
        if(AGE>=1 && AGE<=150){
            if(AGE<21){
                System.out.println("Teenager or kid");
            }else if(AGE<=55) {
                System.out.println("Adult");
            }else {
                System.out.println("Senior");
            }


        }else {
            System.out.println("Invalid age");
        }
        System.out.println("================================================");

        int hourlyRate = 45;
        int weeklyHour = 26;
        int numberOfWeek= 50;

        int salary =0;

        if(hourlyRate>0){
            if(weeklyHour>1 && weeklyHour<=65){
                if(numberOfWeek>1 && numberOfWeek<=52) {
                    salary= hourlyRate*weeklyHour*numberOfWeek;
                    System.out.println(salary);

                }else {
                    System.err.println("weekly number can not be less than 1 or greater than 52"); //err prints the text as error massage.
                }
            }else {
                System.err.println("weekly hours can not be less than 1 or greater than 65");
            }
        }else {
            System.err.println("hourly rate can not be negative");
        }

        System.out.println("========================================================");










    }
}
