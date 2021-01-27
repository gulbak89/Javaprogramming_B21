package day29_methods;

public class ReverseString {
    public static void main(String[] args) {

        ReverseString("good boy");

        System.out.println("==============================");

        String[] names={"Karomet","Anna","Mix","Carol","Hanna"};

        for (String each: names){
            ReverseString(each);
        }

    }

    public static void ReverseString(String str){
        String reverse="";

        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);

        }

        System.out.println(reverse);
    }




}
