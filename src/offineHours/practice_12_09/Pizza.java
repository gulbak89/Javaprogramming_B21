package offineHours.practice_12_09;

public class Pizza {

    public String size;
    public int cheeseTopping, peproniTopping;
    public double priceofPizza, tips, totalPrice;



    public void customizeOrder(String size, int cheeseTopping, int peproniTopping, double tips) {
        this.size = size;
        this.cheeseTopping = cheeseTopping;
        this.peproniTopping = peproniTopping;
        priceofPizza = calculateCost();
        this.tips=tips/100*priceofPizza;
        totalPrice = priceofPizza+this.tips+priceofPizza*0.08;
    }

    public double calculateCost(){

        double startingPrice=(size.equalsIgnoreCase("small"))?10:(size.equalsIgnoreCase("medium"))? 12:14 ;
        double cheese=1*cheeseTopping;
        double peproni=1.5*peproniTopping;

        return startingPrice+cheese+peproni;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseTopping=" + cheeseTopping +
                ", peproniTopping=" + peproniTopping +
                ", priceofPizza=" + priceofPizza +
                ", tips=" + tips +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
