package offineHours.Practice_11_26;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr=new int[5];
        String[] str=new String[5];
        Integer[] Arr=new Integer[5];
        arr[0]=5;
        arr[1]=7;
        arr[3]=3;
        arr[4]=1;
        arr[2]=9;



        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(Arr));

        int[] num=new int[50];
        for (int i=0; i<=num.length-1; i++){
            num[i]=i+1;

        }
        System.out.println(Arrays.toString(num));

        ArrayList<Integer> odd=new ArrayList<>();

        ArrayList<Integer> even=new ArrayList<>();

        for (int each: num){
            if(each%2==0){
                even.add(each);
            }else{
                odd.add(each);
            }
        }

        System.out.println(odd);
        System.out.println(even);





    }
}
