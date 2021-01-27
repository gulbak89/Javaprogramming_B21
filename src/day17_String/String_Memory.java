package day17_String;
import java.lang.String; // this package is always importing automatically. so we don't have to put it


public class String_Memory {

    public static void main(String[] args) {



        /*
                    Java pool:  spacial memory location for String literals only
        strOne---->  "jawa"  <------strTwo
                     "Java"  <------strFive

                     Heap: memory location for all objects

                     "java"  <-------strThree
                     "java"  <-------strFour


         */

        String strOne= "java"; // literal
        String strTwo= "java";  // literal

        String strthree= new String("java");  // Don't type original
        String strFour = new String("java");

        System.out.println(strOne==strTwo);
        System.out.println(strOne==strthree);
        System.out.println(strFour==strthree);

        String strFive = "Java";
        System.out.println(strOne==strFive);


    }
}
