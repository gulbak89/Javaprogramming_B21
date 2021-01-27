package day38_staticKeyword;

public class SalaryObject {

    public static void main(String[] args) {


        SaraltyCalculator s1=new SaraltyCalculator();
        SaraltyCalculator s2=new SaraltyCalculator();
        SaraltyCalculator s3=new SaraltyCalculator();
        SaraltyCalculator s4=new SaraltyCalculator();
        SaraltyCalculator s5=new SaraltyCalculator();

        s1.setInfo(55,40,8,22);
        s2.setInfo(50,40,8,21);
        s3.setInfo(55,40,8,22);
        s4.setInfo(45,40,8,20);
        s5.setInfo(48,40,8,21);

        System.out.println(s1.equals(s3));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);




    }
}
