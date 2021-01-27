package day41_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {

        ArrayList<Item> list=new ArrayList<>();
        list.addAll(Arrays.asList(new Item("apple",1.99,5), new Item("banana",0.99,10),new Item("melon",2,3),
                new Item("mask",10,50)));

        System.out.println(list);

        double total=0;
        for(Item each: list){

            total+=each.calCost();
        }

        System.out.println("total cost of all items: $"+total);











    }
}
