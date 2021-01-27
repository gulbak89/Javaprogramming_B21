package day47_abstraction.shapeTask;

public class Circle extends Shape {

    public double radius, diameter;
    public final static double PI=3.14;

    public Circle(double radius){
        super("Circle");
        this.radius=radius;
        diameter=2*radius;

    }

@Override
    public double calArea(){
        return radius*radius*PI;
    }
@Override
    public double calPerimeter(){
        return diameter*PI;
    }


}
