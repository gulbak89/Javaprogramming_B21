package day44_Inheritance.shapesTask;

public class Circle extends Shape {

    public double radius, diameter;
    public final static double PI=3.14;

   public Circle(double radius){
       super("Circle");
       this.radius=radius;

       diameter=2*radius;
   }


    public double calArea(){
       return radius*radius*PI;
    }

    public double calPerimeter(){
       return diameter*PI;
    }
}
