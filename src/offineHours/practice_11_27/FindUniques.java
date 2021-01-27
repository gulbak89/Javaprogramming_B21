package offineHours.practice_11_27;

import java.util.ArrayList;
import java.util.Arrays;

public class FindUniques {

    public static void main(String[] args) {

        String[] arr={"A","B","C","Q","C","B"};
        ArrayList<String> list=new ArrayList<>();

        for (String each: arr){

            int count=0;

            for (String each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        String[] unique=new String[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            unique[i]=list.get(i);


        }

        System.out.println(Arrays.toString(unique));





















    }

    public static String[] Unique(String[] arr){

    ArrayList<String> list=new ArrayList<>();

        for (String each: arr){

        int count=0;

        for (String each1: arr){

            if(each.equals(each1)){
                count++;
            }
        }

        if(count==1){
            list.add(each);
        }

    }



    String[] unique=new String[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static int[] Unique(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();

        for (Integer each: arr){

            int count=0;

            for (Integer each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        int[] unique=new int[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static char[] Unique(char[] arr){

        ArrayList<Character> list=new ArrayList<>();

        for (Character each: arr){

            int count=0;

            for (Character each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        char[] unique=new char[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }

    public static double[] Unique(double[] arr){

        ArrayList<Double> list=new ArrayList<>();

        for (Double each: arr){

            int count=0;

            for (Double each1: arr){

                if(each.equals(each1)){
                    count++;
                }
            }

            if(count==1){
                list.add(each);
            }

        }



        double[] unique=new double[list.size()];

        for (int i=0; i<=list.size()-1; i++) {

            unique[i] = list.get(i);

        }
        return unique;
    }
}
