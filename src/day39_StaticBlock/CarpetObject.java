package day39_StaticBlock;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {


        Carpet[] carpets={new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(5,7,15,false);
        carpets[1].customOrder(5,7,15,true);
        carpets[2].customOrder(4,8,17,false);
        carpets[3].customOrder(6,9,18,true);
        carpets[4].customOrder(6,9,18,false);

        ArrayList<Carpet> persionCarpetList=new ArrayList<>();
        persionCarpetList.addAll(Arrays.asList(carpets));

        persionCarpetList.removeIf(p->!p.isPersion);

        ArrayList<Carpet> regularCarpet=new ArrayList<>(Arrays.asList(carpets));
        regularCarpet.removeIf(p->p.isPersion);

        System.out.println("=====================================================");

        double totalCostPersion=0;
        for(Carpet each: persionCarpetList){
            System.out.println(each);
            totalCostPersion+=each.calculateCost();
        }

        System.out.println(totalCostPersion);

        double costForRegular=0;

        for (Carpet each: regularCarpet){
            System.out.println(each);
            costForRegular+=each.calculateCost();
        }
        System.out.println(costForRegular);

        System.out.println("Total price of all the carpets: "+(totalCostPersion+costForRegular));








































    }



}
