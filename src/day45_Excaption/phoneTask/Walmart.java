package day45_Excaption.phoneTask;

public class Walmart {

    public static void main(String[] args) {


        Iphone iphone=new Iphone("12 pro Max",1300);

        Sumsung sumsung=new Sumsung("S20",1200);

        Nokia nokia=new Nokia("Break",70);

        iphone.call(4319632);
        sumsung.call(4310906);
        nokia.call(4312390);

        System.out.println(iphone);
        System.out.println(sumsung);
        System.out.println(nokia);

        iphone.faceTime(4319632,4310906,4312390);

        sumsung.freeze();

        nokia.breakFloor();



    }

}
