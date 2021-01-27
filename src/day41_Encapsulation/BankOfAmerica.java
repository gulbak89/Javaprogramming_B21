package day41_Encapsulation;

public class BankOfAmerica {

    public static void main(String[] args) {


        BankAccount obj1=new BankAccount("Michle","Jackson",23424);

        System.out.println(obj1.getAccountHolder());

        System.out.println(obj1.getBalance());



        obj1.deposit(2000);
        obj1.withdraw(500);
        obj1.withdraw(1600);


        obj1.availableBalance();









        System.out.println(BankAccount.bankName);


    }
}
