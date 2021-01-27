package day26_arrays;

public class MaxNumberInArray {

    public static void main(String[] args) {


        int[] numbers = {900, 2, 3, 4, 5, 6, 7,90,48};
        int max = numbers[0];

        for (int i = 1; i <= numbers.length-1; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }


        }
        System.out.println("max = "+max);
    }
}