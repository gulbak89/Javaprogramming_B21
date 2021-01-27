package offineHours.practice_11_27;

import java.text.DecimalFormat;

public class MathPractice {
    public static void main(String[] args) {

        double n1= Math.pow(10,2);   // power

        System.out.println(n1);


        System.out.println(Math.max(100,200));

        int[] numbers={1,2,3,4,5,6,7};
        int max=numbers[0];
        int min=numbers[0];

        for (int each: numbers){
            max=Math.max(max,each);
            min=Math.min(min,each);
        }

        System.out.println(max);
        System.out.println(min);


        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.sqrt(100));

        DecimalFormat df=new DecimalFormat("0.00");

        System.out.println(df.format(2.987777));



        System.out.println(df.format(areaOfCircle(2.3)));



        int num1=100;

        int num2=Integer.parseInt((""+num1).substring(0,2));

        System.out.println(num2);

        // Java Faker==> generate random data;  will be covered in the future topics.










    }
    public static double areaOfCircle(double r){

        return Math.PI*Math.pow(r,2);
    }
}
