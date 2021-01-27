package day42_Inheritance.deviceTask;

public class Phone extends Device {

    public static boolean canCall, canSendMassage, hasCamera;
    static {
        canCall=true;
        canSendMassage=true;
        hasCamera=true;
    }

    public Phone(String deviceName, String brand, String model, double price) {

        setInfo("phone",brand,model,price);
    }

    public void call(long number){
        System.out.println(brand+" "+model+" is calling "+number);
    }

    public void ring(){
        System.out.println(brand+" "+model+" is ringing");
    }

    public void text(long number){
        System.out.println(brand+" "+model+" is texting to "+number);
    }

}
