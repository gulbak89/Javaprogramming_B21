package day27_ForEachLoop;

import java.util.Arrays;

public class CombineTwoArrays2 {

    public static void main(String[] args) {

        String[] group1={"Anna", "Hannah", "Max","Mike","Susan"};
        String[] group2={"Amat", "Samat","Ayshe","Kamil"};
        String[] group3={"Gul","Aygul","Roshen"};

        String[] combine=new String[group1.length+group2.length+group3.length];
        int j=0;

        for(String each1: group1){
            combine[j]=each1;
            j++;
        }

        for(String each2:group2) {
            combine[j]=each2;
            j++;
        }

        for(String each3:group3){
            combine[j]=each3;
            j++;
        }

        Arrays.sort(combine);

        System.out.println(Arrays.toString(combine));
    }
}
