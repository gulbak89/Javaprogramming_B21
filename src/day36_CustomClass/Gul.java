package day36_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Gul {

    public static void main(String[] args) {


        ArrayList<Offer> offers=new ArrayList<>(Arrays.asList(new Offer(),new Offer(),new Offer()));

        offers.get(0).setInfo("CA","SDET","Google",150000,true,true,true,true);
        offers.get(1).setInfo("PA","Researcher","Pyzer",130000,true,false,true,true);
        offers.get(2).setInfo("VA","QA","Toyota",100000,true,true,true,false);

        for (int i=0; i<=offers.size()-1; i++){

            offers.get(i).getInfo();
        }

        System.out.println("==============================");

        for (Offer each: offers){
            if(each.location.equalsIgnoreCase("VA")){
                each.getInfo();
            }
        }

        System.out.println("===================================================");

        ArrayList<Offer> localOffers=new ArrayList<>(offers);
        localOffers.removeIf(p->!(p.location.equalsIgnoreCase("PA")));
        System.out.println("VA offers: "+localOffers.size());

        System.out.println("===================================================");

        ArrayList<Offer> SdetOffers=new ArrayList<>(offers);
        SdetOffers.removeIf(p->!(p.jobTile.equalsIgnoreCase("SDET")));
        System.out.println("SDET offers: "+SdetOffers.size());

        System.out.println("===================================================");

        ArrayList<Offer> goodSalary=new ArrayList<>(offers);
        goodSalary.removeIf(p->p.salaray<120000);
        System.out.println("Job with good salary: "+goodSalary.size());

        System.out.println("============================================");
        ArrayList<Offer> fullTimeOffers=new ArrayList<>(offers);
        fullTimeOffers.removeIf(p->!p.hasFullTime);

        System.out.println("Offers has full time: "+fullTimeOffers.size());







    }
}
