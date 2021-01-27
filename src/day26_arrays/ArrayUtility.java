package day26_arrays;

import java.util.Arrays;   // array utility,

public class ArrayUtility {

    public static void main(String[] args) {

        int[] numbers={1,2,3,4,5,6,0,8};



        System.out.println(Arrays.toString(numbers));  // inorder to print out entire array, Arrays is the utility of the class Array
        Arrays.sort(numbers);    // sort method does not returns any value, so can not be assigned to a variable
        System.out.println(Arrays.toString(numbers)); //to.String method
        System.out.println("Max: "+numbers[numbers.length-1]);
        System.out.println("Min: "+numbers[0]);
        System.out.println("=======================================");

        String[] classMates={"Mike", "Jake", "Marry", "Susan"};
        System.out.println(Arrays.toString(classMates).replace("[","{").replace("]","}"));
        Arrays.sort(classMates);    // sort the string in Eski table order
        System.out.println(Arrays.toString(classMates));

        System.out.println("=======================================");

        double[] num={0.5,0,4,2,4.6,7,0.1};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println("Second max number: "+num[num.length-2]);
        System.out.println("Second min number: "+num[1]);

        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]+" ");
        }

        System.out.println();

        System.out.println("===========================");

        int[] a1={1,2,3};
        int[] a2={1,2,3};

        boolean r1=Arrays.equals(a1,a2);
        System.out.println(r1);







    }
}
