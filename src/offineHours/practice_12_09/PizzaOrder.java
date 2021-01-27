package offineHours.practice_12_09;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrder {
    public static void main(String[] args) {

       Pizza order1=new Pizza();
        Pizza order2=new Pizza();
        Pizza order3=new Pizza();


        order1.customizeOrder("medium",1,1,15);
        order2.customizeOrder("small",0,1,15);
        order3.customizeOrder("large",1,2,20);

        System.out.println(order1);

        Pizza[] partyPizza=new Pizza[175];

        for(int i=0; i<=174; i++) {
            Pizza pizza=new Pizza();
            pizza.customizeOrder("medium", 2, 3, 18);
            partyPizza[i]=pizza;

        }

        double total=0;

        for(Pizza each: partyPizza){
            total+=each.totalPrice;
        }

        System.out.println("Total price for 175 pizza is: "+total);


        System.out.println("=================================");

        ArrayList<Pizza> pizzas=new ArrayList<>();
        for (int i=1; i<=60; i++) {
            Pizza medium = new Pizza();
            medium.customizeOrder("medium",2,3,18);

            Pizza large=new Pizza();
            large.customizeOrder("large",3,4,18);

            Pizza small=new Pizza();
            small.customizeOrder("small",1,1,18);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }

        System.out.println(pizzas.size());

        double total2=0;

        for (Pizza each: pizzas){

            total2+=each.totalPrice;
        }

        System.out.println(total2);










    }
}
