package day23_NestedLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {// find frequency of the word "Java" in the given sentence.

        String s="Java is a program language, I like to learn Java";
        String word="Java";

        int count=0;

        while(s.contains(word)){

            s=s.replaceFirst(word,"");
            count++;
        }

        System.out.println(count);
    }
}
