package day38_staticKeyword;

public class IphoneObject {

    public static void main(String[] args) {


        Iphone phone1=new Iphone();
        Iphone phone2=new Iphone();
        Iphone phone3=new Iphone();
        Iphone phone4=new Iphone();
        Iphone phone5=new Iphone();

        phone1.operatingSystem="Andeoid";  // if we changed the static method, all of the object will change to


        System.out.println(phone1.operatingSystem);
        System.out.println(phone2.operatingSystem);
        System.out.println("===========================");

        phone1.operatingSystem="iOS";

        Iphone.getIphoneInfo();


    }


}
