package offineHours.practice_1_27;

import day45_Excaption.phoneTask.Iphone;
import day45_Excaption.phoneTask.Nokia;
import day45_Excaption.phoneTask.Phone;
import day45_Excaption.phoneTask.Sumsung;

public class PolymorphismPractice {


    public static void main(String[] args) {
        Phone phone = new Iphone("12pro",1200);
        Phone phone2=new Nokia("N30",750);
        Phone phone3=new Sumsung("Galacy",950);

        boolean b1=phone3 instanceof Sumsung;
        System.out.println(b1);

        System.out.println(phone instanceof Nokia);
        System.out.println("===================================");










    }
}
