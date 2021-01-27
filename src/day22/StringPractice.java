package day22;

public class StringPractice {

    public static void main(String[] args) {

        String str="My name is gulbakram";
        String name=str.substring(str.lastIndexOf("g"));

        System.out.println(name);


        String s= "I like Java and Java Java Java";
        s=s.replace("Java","").replace("like","like Java").replace("and","and C#");

        System.out.println(s);
    }
}
