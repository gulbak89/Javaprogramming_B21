package day20_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str="ahahah";

        String result=""; // "cba"

        for(int i= str.length()-1; i>=0; i--){    // start from last character
           result+=str.charAt(i);    // "+" serves as concatenation for Strings
        }
        System.out.println(result);


    }
}
