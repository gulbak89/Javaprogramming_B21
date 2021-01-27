package day18_String;


import java.util.Scanner;

public class SubString_method {
    public static void main(String[] args) {



        String str = "I love Java Programming";
        String name= str.substring(7,11);  // endIndex number should be n+1, because ending index will be excluded.

        System.out.println(name);

        String str2= "Today is Monday";
        String name2= str2.substring(9,15);

        System.out.println(name2);

        String email= "gulbakram@gmail.com";
        String domain= email.substring(10,15);

        System.out.println("domain of the email is: "+domain);

        System.out.println("====================================");

        String firstName="mArDaN";  //Mardan
        String firstcharacter=firstName.substring(0,1).toUpperCase();
        String Name=firstcharacter+firstName.substring(1,firstName.length()-1+1).toLowerCase();

        System.out.println(firstcharacter);
        System.out.println(Name);

        System.out.println("========================================");
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter you first name and last name");
        String fName=scan.nextLine();
        String lName=scan.nextLine();

        fName= fName.substring(0,1).toUpperCase()+fName.substring(1,fName.length()-1+1).toLowerCase();
        lName=lName.substring(0,1).toUpperCase()+lName.substring(1,lName.length()-1+1).toLowerCase();
        String FullName= fName+" "+lName;


        System.out.println("Full name is: "+FullName);




    }
}
