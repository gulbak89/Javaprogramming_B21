package day23_NestedLoop;

public class FrequancyOfWord2 {

    public static void main(String[] args) {

        String s="Java Java Java java";
        String word="java";

        String temp=s.toLowerCase();  // "java java java java"==> to ignore the case sensitivity.
        int count=0;

        while(temp.contains(word)){

            temp=temp.replaceFirst(word,"");
            count++;
        }
        System.out.println(count);

    }
}
