package day30_returnMethod;

import java.util.Arrays;

public class ReturnMethod3 {

    public static int max(int[] arr){

        int max=arr[0];

        for (int each: arr){
            if(each>max){
                max=each;
            }
        }
        return max;
    }

    public static int max2(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int min(int[] arr){
        int min=arr[0];
        for (int each: arr){
            if(each<min){
                min=each;
            }
        }
        return min;
    }

    public static int frequency(String str, char ch){
        int count=0;

        for (char each:str.toCharArray()){
            if(each==ch){
                count++;
            }

        }
        return count;
    }

    public static String unique(String str){

        String unique="";

        for (int i=0; i<=str.length()-1; i++){
            char each=str.charAt(i);
            int count=frequency(str,each);
            if(count==1){
                unique+=each;
            }

        }

        return unique;
    }

    public static String CharFrequency(String str){
        String result="";

        for (int i=0; i<=str.length()-1; i++){
            char each=str.charAt(i);
            int count=frequency(str,str.charAt(i));
            if(result.contains(each+"")){
                continue;
            }else{
                result+=""+each+count;

            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] numbers={2,5,3,7,8,1};

        int max=max(numbers);
        int min=min(numbers);

        System.out.println("maximum number is: "+ max);
        System.out.println("minimum number is: "+min(numbers));

        System.out.println(max2(numbers));


        String str="aaabbbcccdfg";
        String unique="";

        for (int i=0; i<=str.length()-1; i++) {

           char each=str.charAt(i);
           int count=frequency(str,each);

           if(count==1){
               unique+=each;
           }
        }

        System.out.println(unique);

        System.out.println(unique(str));

        System.out.println(CharFrequency("aabbdehdk"));





    }
}
