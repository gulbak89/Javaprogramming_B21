package day41_Encapsulation;

public class Item {

    public String name;
    //access modifier: determines if the method or variable is reachable; public-> is always reachable.
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calCost(){

        return unitPrice*quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity=" + quantity +
                ", total Price= $"+calCost()+
                '}';
    }
}
