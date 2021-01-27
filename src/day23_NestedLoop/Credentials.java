package day23_NestedLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your User Name:");
        String UserName=scan.next();

        System.out.println("Enter your password: ");
        String Passward= scan.next();

        if(UserName.equals("cybertek")&& Passward.equals("cybertek123")){
            System.out.println("Logged in ");

        } else{

            for(int i=1; i<=3; i++){

                if(i==3){
                    System.err.println("Your account is locked");
                    System.exit(0);
                }
            System.out.println("Invalid user name or password, please re-enter");
                System.out.println("Enter your user name");
            UserName=scan.next();

                System.out.println("Enter your password");
                Passward=scan.next();

                if(UserName.equals("cybertek")&& Passward.equals("cybertek123")){
                    System.out.println("Logged in");
                    break;
                }




            }

        }
        System.out.println("Hello world");











    }



}
