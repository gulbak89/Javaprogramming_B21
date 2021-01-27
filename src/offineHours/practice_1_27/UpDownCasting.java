package offineHours.practice_1_27;

import day45_Excaption.phoneTask.Iphone;
import day45_Excaption.phoneTask.Nokia;
import day45_Excaption.phoneTask.Phone;
import day45_Excaption.phoneTask.Sumsung;
import day49_Abstraction.shapeTask.Circle;
import day49_Abstraction.shapeTask.Cylinder;
import day49_Abstraction.shapeTask.Volume;

public class UpDownCasting {

    public static void main(String[] args) {

        Phone phone =new Iphone("12 Pro Max",1250);// upCasting, done automatically
        Iphone iphone=(Iphone) phone;  //DownCasting: done manually
        ((Iphone) phone).faceTime(1214321);

        //Phone phone2=(Sumsung) phone;  // ClassCastException, cause there is no "is a relation" between Iphone and Samsung

        System.out.println("=============================");

        Phone phone3=new Nokia("NK",700);
        ((Nokia) phone3).breakFloor();
        //((Iphone) phone3).faceTime(123452);   //ClassCastException will occur.

        System.out.println("=================================");

        Volume v=new Cylinder(6,3);//upCasting
        ((Cylinder) v).area();  //downCasting
        v.volume();















    }
}
