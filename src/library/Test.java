package library;

import static day41_Encapsulation.Data.*;
import day41_Encapsulation.Data;
import day43_Inheritance.AccessModifiers;

public class Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(publicVariable);
       // System.out.println(privateVariable);
        //System.out.println(defaultVariable);


        publicMethod();
        //privateMehtod();  not reachable outside the class
       // defaultMethod();  not reachable outside the package


        Test.publicMethod();
        Test.protectedMehtod();



    }
}
