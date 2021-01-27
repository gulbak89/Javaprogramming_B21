package day48_abstraction;

public interface InterfaceRules {  // Interface: cannot have objects, cannot be final, because it is meant to be implemented.
                                   // cannot have constructors, because it is not class.
                                   // cannot have instance methods,        can have static methods, default methods and abstract methods. access modifier is public by default.
                                   // cannot have instance variables,      The variables in the interface are public, static, and final by default.

    //why we need Interface: A class can implement multiple interface, but only extends one class. that is the advantage of the interface over Abstract class.

    /* Abstract                VS                  Interface:   both for achieving abstraction; both meant to be inherited(extends, implements); both cannot creates objects.both cannot be final

   a class only extends one abstract class                     a class can implements multiple Interface
   can have everything regular class have+abstract method       variables: public, final, static;  methods: abstract, static, default;


     */




    void method(); // abstract method by default.

    int a=10; //its public, static and final  by default.

    public static void main(String[] args) {  // static method

        System.out.println(a);
    }

    public default void m(){  // default method

    }




}
