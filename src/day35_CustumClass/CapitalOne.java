package day35_CustumClass;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount acount1=new BankAccount();
        BankAccount acount2=new BankAccount();
        BankAccount acount3=new BankAccount();
        BankAccount acount4=new BankAccount();
        BankAccount acount5=new BankAccount();
        BankAccount acount6=new BankAccount();

        acount1.setInfo("Mike Carter","01123384728");
        acount1.deposit(2000);
        acount1.withdraw(200.69);

        acount1.getInfo();
        acount1.showBalance();

        acount2.setInfo("Sara Grey","283719284736");
        acount2.getInfo();
        acount2.deposit(3000);
        acount2.withdraw(300);
        acount2.showBalance();

    }
}
