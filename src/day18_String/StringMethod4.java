package day18_String;

public class StringMethod4 {

    public static void main(String[] args) {  // isEmpty, isEquals, contains, startsWith, endsWith

        String str= "Hello everyone";
        System.out.println(str.isEmpty());   //isEmpty

        String str2="";          // space " " is count as empty.
        System.out.println(str2.isEmpty());

        System.out.println("================================");

        String sent= "I like to learn Java";
        System.out.println(sent.contains("Java")); // contains
        System.out.println(sent.contains("C#"));

        System.out.println("=================================");

        String web= "www.amazon.com";

        System.out.println(web.startsWith("www."));
        System.out.println(web.endsWith(".com"));

        boolean isValidWeb= web.startsWith("www.") && web.endsWith(".com");







    }
}
