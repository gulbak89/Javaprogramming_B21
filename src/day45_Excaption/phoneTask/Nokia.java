package day45_Excaption.phoneTask;

public final class Nokia extends Phone {

    public Nokia( String model, double price) {
        super("Nokia", model, "Finland", price);
    }

    public void breakFloor(){
        System.out.println(brand+" "+model+" broke the floor");
    }


}
