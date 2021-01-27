package day18_String;

public class StringMethod3 {
    public static void main(String[] args) {

        String s1= "Java is fun, Java is cool";
        String s2=s1.replace("Java","Python");

        System.out.println(s1);
        System.out.println(s2);

        String email="gulbakram@gmail.com";
        email=email.replace("gmail","yahoo");

        System.out.println(email);

        String essay= "Batch 20 is cool, Batch 20 is the best, Batch 20 students are awesome";
        essay=essay.replace("20","21");

        System.out.println(essay);

        String s="I like to learn C#, C# is very cool";
        s=s.replace("C#","Java");
        System.out.println(s);


        String s3="Cat is friend, cat is adorable";
        s3=s3.replaceFirst("Cat", "Dog");
        System.out.println(s3);

        String t= "I like Java, because Java is cool, Java is powerful";
        t=t.replaceFirst("Java is","Python is");
        System.out.println(t);

        t=t.replace("Java ","C# ");
        System.out.println(t);

        System.out.println("============================================");

        String a= "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
        a=a.replaceFirst("Monday","Sunday");
        a=a.replaceFirst("be Monday","be Tuesday");
        System.out.println(a);
        System.out.println("============================================");

        String Email = "gulbakram@gmail.com";

        int beginingIndex= Email.indexOf("@")+1;
        int endingIndex= Email.indexOf(".");

        String Domain= Email.substring(beginingIndex,endingIndex);
        System.out.println(Domain);

        System.out.println("================================");
        String p ="I like to watch movies and reading books";
        String word2= p.substring(p.indexOf("m"),p.indexOf(" a"));

        System.out.println(word2);

        System.out.println("===================================");

        String y= "I like to learn Java, Java is cool, I like to watch Jumanji";
        int n1= y.indexOf("Java ");
        int n2=y.indexOf(" is");
        String y2= y.substring(n1,n2);

        int n3= y.lastIndexOf("J");

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        System.out.println(y2);
        System.out.println("===================");

        String m= "My name is Marry";
        int m1=m.lastIndexOf("M");

        System.out.println(m1);










    }
}
