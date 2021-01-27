package day35_CustumClass;

import java.time.LocalDate;

public class BankAccount {

    public String acountName;
    public String accountNumber;
    public double availableBalance=0;

    public void setInfo(String bankAccountName, String bankAccountNumber ){

        acountName=bankAccountName;
        accountNumber=bankAccountNumber;

    }

    public void getInfo(){

        System.out.println("===============================");
        System.out.println("Account name: "+acountName);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Available balance: "+availableBalance);
        System.out.println("===============================");
    }

    public void deposit(double amount){

        availableBalance+=amount;

    }

    public void withdraw(double amount){

        availableBalance-=amount;
    }

    public void showBalance(){

        System.out.println("As of today "+ LocalDate.now()+" "+acountName+" available balance is: $"+availableBalance);


    }









}
