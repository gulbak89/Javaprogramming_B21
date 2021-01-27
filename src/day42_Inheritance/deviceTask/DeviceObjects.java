package day42_Inheritance.deviceTask;

public class DeviceObjects {

    public static void main(String[] args) {

        TV tv=new TV("Sony","SN2",1200);
        System.out.println(tv);
        tv.channelUp();
        tv.turnOn();


        Phone phone=new Phone("phone","iphone","12 Pro Max",1200);

        phone.text(4332390);
        phone.call(4319632);





    }
}
