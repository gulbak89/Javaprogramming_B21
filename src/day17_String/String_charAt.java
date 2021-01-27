package day17_String;

public class String_charAt {
    public static void main(String[] args) {

        String str = "Cybertek";

        System.out.println(str.charAt(0));    // index---> position of each character in the String.
        System.out.println(str.charAt(5));    // data type of the return value is char

        char second = str.charAt(2);
        System.out.println(second);

        char last = str.charAt(7);
        System.out.println(last);


    }
}
