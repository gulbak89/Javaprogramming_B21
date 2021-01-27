package day26_arrays;

import java.util.Arrays;

public class UniqueWords {

    public static void main(String[] args) {


        String[] words = {"C#", "Java", "C#", "Java", "Python"};
        String result="";
        for (int j = 0; j < words.length; j++) {

            String eachWord = words[j];
            int count = 0;

            for (int i = 0; i < words.length; i++) {
                if (eachWord.equalsIgnoreCase(words[i])) {
                    count++;
                }
            }
            if(count==1){
                result+=eachWord;


            }

            System.out.print(result);
        }
    }
}
