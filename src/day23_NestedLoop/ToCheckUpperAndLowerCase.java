package day23_NestedLoop;

public class ToCheckUpperAndLowerCase {

    public static void main(String[] args) {

        String s="Gul";

        char f=s.charAt(0);
        char l=s.charAt(s.length()-1);

        boolean start=f>='A' && f<='Z';
        boolean end=  l>='a' && l<='z';

        System.out.println(start && end);
    }
}
