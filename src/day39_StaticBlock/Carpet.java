package day39_StaticBlock;

public class Carpet {

    public double width,length,unitPrice;
    public boolean isPersion;



    public void customOrder(double width, double length, double unitPrice, boolean isPersion) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersion = isPersion;
    }

    public double calculateCost(){

        return (isPersion)?width*length*unitPrice+200:width*length*unitPrice;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersion=" + isPersion +
                ", total price="+calculateCost()+
                '}';
    }
}
