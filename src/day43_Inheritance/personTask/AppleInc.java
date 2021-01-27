package day43_Inheritance.personTask;

public class AppleInc {
    public static void main(String[] args) {

        Tester tester1=new Tester("Max",'M',30,"QA","t321",50);
        Tester tester2=new Tester("Marry",'F',29,"SDET","t322",55);
        Tester tester3=new Tester("Ayshem",'F',28,"SDET","t320",55);
        Tester tester4=new Tester("Miradil",'M',30,"QA","t321",50);
        Tester tester5=new Tester("Hashimjan",'M',32,"SDET","t321",57);


        Developer developer1=new Developer("Muyesser",'F',32,"Software Engineer","d534",65);

        tester1.test();
        tester2.eat();
        tester3.sleep();

        System.out.println("Salary of "+tester1.name+" :"+tester5.calSalary());

        System.out.println(tester4);

        System.out.println(developer1);





    }
}
