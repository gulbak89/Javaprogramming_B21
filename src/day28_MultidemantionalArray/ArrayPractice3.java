package day28_MultidemantionalArray;

public class ArrayPractice3 {

    public static void main(String[] args) {

        double[] salary={12000.5, 10000.5, 9000.0, 22000.0, };

        double sum=0;

        double max=salary[0];
        double min=salary[0];

        for (double each: salary){

            sum+=each;

            if(each>max){
                max=each;
            }

            if(each<min){
                min=each;
            }
        }

        System.out.println("Average salary is: "+sum/4);
        System.out.println(max);
        System.out.println(min);
    }
}
