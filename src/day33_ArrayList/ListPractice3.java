package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice3 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Katy");
        names.add("Amir");
        names.add("Amir");
        names.add("Nadira");
        names.add("Akber");
        names.add("Ilghar");
        names.add("Zohra");
        names.add("Ilghar");
        names.add("Ilghar");

        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.remove("Ilghar");
        System.out.println(names);

        names.remove(names.size()-1);
        System.out.println(names);

        names.clear();
        System.out.println(names.size());
        System.out.println(names);




    }
}
