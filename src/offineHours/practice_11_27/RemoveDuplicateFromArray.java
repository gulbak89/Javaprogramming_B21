package offineHours.practice_11_27;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {

        int[] arr={1,2,1,2,4,3,4,5,6,7,8,6,9};

        ArrayList<Integer> list=new ArrayList<>();

        for (int each: arr){
            if(list.contains(each)){
                continue;
            }else{
                list.add(each);
            }
        }

        System.out.println(list);


        int[] nonDuplicate=new int[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            nonDuplicate[i]=list.get(i);
        }

        System.out.println(Arrays.toString(nonDuplicate));








    }

    public static int[] removeDuplicated(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();

        for (int each: arr){
            if(list.contains(each)){
                continue;
            }else{
                list.add(each);
            }
        }

        System.out.println(list);


        int[] nonDuplicate=new int[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            nonDuplicate[i]=list.get(i);
        }

        return nonDuplicate;

    }

    public static double[] removeDuplicated(double[] arr){

        ArrayList<Double> list=new ArrayList<>();

        for (double each: arr){
            if(list.contains(each)){
                continue;
            }else{
                list.add(each);
            }
        }

        System.out.println(list);


        double[] nonDuplicate=new double[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            nonDuplicate[i]=list.get(i);
        }

        return nonDuplicate;

    }

    public static char[] removeDuplicated(char[] arr){

        ArrayList<Character> list=new ArrayList<>();

        for (char each: arr){
            if(list.contains(each)){
                continue;
            }else{
                list.add(each);
            }
        }

        System.out.println(list);


        char[] nonDuplicate=new char[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            nonDuplicate[i]=list.get(i);
        }

        return nonDuplicate;

    }

    public static String[] removeDuplicated(String[] arr){

        ArrayList<String> list=new ArrayList<>();

        for (String each: arr){
            if(list.contains(each)){
                continue;
            }else{
                list.add(each);
            }
        }

        System.out.println(list);


        String[] nonDuplicate=new String[list.size()];

        for (int i=0; i<=list.size()-1; i++){

            nonDuplicate[i]=list.get(i);
        }

        return nonDuplicate;

    }
}
