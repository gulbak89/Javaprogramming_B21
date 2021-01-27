package offineHours.practice_11_27;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

      String s1="Listen";
      String s2="Silent";

      s1=sort(s1.toLowerCase());
      s2=sort(s2.toLowerCase());

      if(s1.equals(s2)){
          System.out.println("it is anagram");
      }else{
          System.out.println("Not anagram");
      }

        System.out.println("================================");

      String[] a1=s1.split("");
      String[] a2=s2.split("");

      Arrays.sort(a1);
      Arrays.sort(a2);

      boolean isAnagram=Arrays.equals(a1,a2);
      if(isAnagram)
          System.out.println("it is anagram");
      else
          System.out.println("not anagram");














    }
    public static String sort(String str) {

        String result = "";

        char[] ch=str.toCharArray();
        Arrays.sort(ch);

        for (char each: ch){
            result+=each;
        }



     return result;
    }
}
