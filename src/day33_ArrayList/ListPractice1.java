package day33_ArrayList;

import java.util.ArrayList;

public class ListPractice1 {
    public static void main(String[] args) {

        ArrayList<Integer> odd= new ArrayList<>();
        ArrayList<Integer> even= new ArrayList<>();


        for (int i=0; i<=100; i++){
            if(i%2==0){
               even.add(i);
            }else{
                odd.add(i);
            }
        }

        System.out.println(odd.toString());
        System.out.println(even.toString());

        System.out.println(odd.get(odd.size()-1));
        System.out.println(even.get(even.size()-1));
        System.out.println("==================================================");

        int[] arr1={1,2,3,4,5,6};
        int[] arr2={7,8,9,10,11,12};


        ArrayList<Integer> list1=new ArrayList<>();
        for (int each: arr1){
            list1.add(each);
        }

        for (int each: arr2){
            list1.add(each);
        }

        int[][] arr2D={arr1,arr2};
        ArrayList<Integer> list2=new ArrayList<>();

        for (int[] eacharr:arr2D){
            for (int each: eacharr){
                list2.add(each);
            }

        }

        System.out.println(list1.toString());
        System.out.println(list2.toString());

    }
}
