package day30_returnMethod;

public class ReturnMethod2 {
    public static void main(String[] args) {

        Palindrome("Anna");

        String name="Hanna";

       String reverseName=reverse(name);

        if(name.equalsIgnoreCase(reverseName)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }


    }

    public static void Palindrome(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            char eachar=str.charAt(i);
            reverse+=eachar+"";

        }

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("it is a palindromic string");
        }else{
            System.out.println("it is not a palindrome");
        }
    }

    public static String reverse(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;


    }
}
