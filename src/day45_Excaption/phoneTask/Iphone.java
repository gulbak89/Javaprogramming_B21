package day45_Excaption.phoneTask;

public final class Iphone extends Phone{

    public Iphone( String model,  double price) {
        super("Apple iphone", model, "USA", price);
    }

    public void faceTime(long number){
        System.out.println(brand+" "+model+" is faceTiming "+number);

    }

    public void faceTime(String email){
        System.out.println(brand+" "+model+" is faceTiming "+email);

    }

    public void faceTime(long number1, long number2){
       faceTime(number1);
       faceTime(number2);

    }

    public void faceTime(String email1, String email2){
        faceTime(email1);
        faceTime(email2);

    }

    public void faceTime(long number1, long number2, long number3){
        faceTime(number1,number2);
        faceTime(number3);

    }

    public void faceTime(String email1, String email2, String email3){
        faceTime(email1,email2);
        faceTime(email3);

    }








}
