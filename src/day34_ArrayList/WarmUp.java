package day34_ArrayList;

import java.util.ArrayList;

public class WarmUp {

    public static void main(String[] args) {

        ArrayList<Integer>  list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        list.set(list.size()-1,0);
        System.out.println(list);

        list.clear();

        System.out.println(list.isEmpty());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i=0; i<list.size(); i++){

           int each= list.get(i);    // unboxing
            if(each%2!=0){
                list.set(i,each*2);
            }

        }

        System.out.println(list);

        System.out.println("====================================");

        int[] scores={65,75,77,68,88,82,72,95,99,98};

        ArrayList<Integer> Alist=new ArrayList<>();
        ArrayList<Integer> Blist=new ArrayList<>();
        ArrayList<Integer> Clist=new ArrayList<>();
        ArrayList<Integer> Dlist=new ArrayList<>();

        for (int each: scores){

                if (each >= 90) {
                    Alist.add(each);
                } else if (each >= 80) {
                    Blist.add(each);
                } else if (each >= 70) {
                    Clist.add(each);
                } else {
                    Dlist.add(each);
                }

        }

        System.out.println("Totoal number of A: "+ Alist.size());
        System.out.println("Totoal number of B: "+ Blist.size());
        System.out.println("Totoal number of C: "+ Clist.size());
        System.out.println("Totoal number of D: "+ Dlist.size());

        System.out.println("A: "+Alist);
        System.out.println("B: "+Blist);
        System.out.println("C: "+Clist);
        System.out.println("D: "+Dlist);











    }
}
