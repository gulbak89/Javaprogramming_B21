package day47_abstraction.shapeTask;

public abstract class Shape {     // the Shape (superClass) is not concrete,  so make the it abstract class using "abstract" keyWord.
                                  // object can not be created by abstract class
                                 // abstract class cannot be final; cannot create an object
    /*
    abstract class          VS            regular class:         They both can have method, variables, blocks.
    cannot have object                    can have object
    cannot be final                       can be final
    can have abstract method              cannot have abstract method
     */

    public String name;

    public Shape(String name){
       this.name=name;
    }


    public abstract double calArea();   // make it abstract method by using "abstract" keyWord. Abstract method is a method without a body and implementation
                                        // Abstraction: hiding the implementation and details of the methods.


    public abstract double calPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area="+ calArea()+
                ", perimeter="+calPerimeter()+
                '}';
    }
}
