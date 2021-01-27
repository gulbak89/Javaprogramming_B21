package day17_String;

public class String_equal {

    public static void main(String[] args) {

        String str = "jira";
        String str2= new String("jira");

        System.out.println(str==str2);   //false, comparing the location of the objects
        System.out.println(str.equals(str2));  //true, comparing the value of the objects, in other word, comparing the actual characters
        System.out.println(str.equals("jira"));
        System.out.println(str.equalsIgnoreCase("JIRA"));
    }
}
