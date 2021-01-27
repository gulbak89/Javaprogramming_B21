package day18_String;

public class String_practice {

    public static void main(String[] args) {

        String s1= "Cat";
        String s2= "Cat";  // "Cat" is located in the String pool, since s1 and s2 stored same object"Cat" in the string pool, so there will be only one "Cat" in the string pool.

        System.out.println(s1==s2);

        String s3= new String("Cat");

        System.out.println(s1==s3);   // they are not same object
        System.out.println(s2==s3);

        String s4=new String("Cat");
        System.out.println(s3==s4);  // even the new String "Cat" is same object, but they located in the different location in the java heap.

        System.out.println(s1.equals(s3)); //only comparing the content(text) of the object, so it will be true.
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s4));

        String s5=new String("cat");
        System.out.println(s1.equals(s5));   // it is case sensitive
        System.out.println(s1.equalsIgnoreCase(s5));  // ignore the case

        String str="cybertek";
        str.toUpperCase();  // creating new object by upper case method, it can not change the str to upper case, because String is immutable.

        System.out.println(str);
        System.out.println(str.toUpperCase());

        str=str.toUpperCase(); // We assign str to new object str.toUpperCase.
        System.out.println(str);


        System.out.println("===================================================================");

        String fullName="Gulbakram Xapkat";
        System.out.println(fullName.length());  // leng() will return int
        int lastindex=fullName.length()-1;

        int num= fullName.length();

        System.out.println(lastindex);

        System.out.println("========================================================");

        String a= "Cybertek School";

       char first= a.charAt(0) ;  // first character
       char last= a.charAt(a.length()-1);  // last character

        System.out.println("first character is: "+first); // return first character
        System.out.println("last character is: "+last);  // return last character

        System.out.println("second character is: "+a.charAt(1));   //return second character
        System.out.println("second last character is: "+a.charAt(a.length()-2));  //return second last character

        System.out.println("============================================================");








    }
}
