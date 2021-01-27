package day26_arrays;

public class MinNumberInArray {
    public static void main(String[] args) {

        int[] number={1,2,3,4,5,6,7};
        int min=number[0];

        for(int i=1; i<=number.length-1; i++){

            if(number[i]<min){
                min=number[i];
            }
        }

        System.out.println("Min is: "+min);
    }
}
