package day34_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class SimpleLambdaExpression {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Predicate<Integer> lessThan5=each -> each<5;
        //Predicate<dataType>  name = p -> boolean expression

        nums.removeIf(lessThan5);  // nums.removeIf(p->p<5);
        nums.removeIf(p->p>8);

        System.out.println(nums);

        System.out.println("==================================");

        ArrayList<Integer> scores=new ArrayList<>();
        scores.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));

        scores.removeIf(p->p%3==0 || p%5==0);

        System.out.println(scores);

        System.out.println("=======================================");

        ArrayList<String> employees=new ArrayList<>(Arrays.asList("Ahmad","Ahmad","Erjon","Ahmad","Adil","Afroz"));

        employees.removeIf(p-> p.startsWith("A") && !p.equalsIgnoreCase("Ahmad"));

        System.out.println(employees);

        System.out.println("========================================");
        ArrayList<String> employees2=new ArrayList<>(Arrays.asList("Ahmad","Ahmad","Erjon","Ahmad","Adil","Afroz"));
        employees2.removeIf(p->p.toLowerCase().contains("a") && p.toLowerCase().contains("r"));

        System.out.println(employees2);







    }
}
