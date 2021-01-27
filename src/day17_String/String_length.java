package day17_String;

public class String_length {

    public static void main(String[] args) {

        String str = "dkfjkdsjfkljdfdskfjdkjflkj";
        String str2= "dkjfkldsjfslk";

        System.out.println(str.length());  // length()---> counting how many characters in the String.
        System.out.println(str2.length());

        int length = str.length();
        System.out.println(length);

        System.out.println(length==str2.length()); // comparing the length
        System.out.println(length==str.length());
    }
}
