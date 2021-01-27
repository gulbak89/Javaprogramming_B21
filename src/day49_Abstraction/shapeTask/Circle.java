package day49_Abstraction.shapeTask;

public final class Circle extends Shape {

    public double radius,diameter;
    public final static double PI=3.14;

    public Circle( double radius) {
        super("Circle");
        if(radius<=0){
            throw new RuntimeException("No such a circle with a radius of "+radius);
        }
        this.radius = radius;
        diameter=radius*2;
    }

    @Override
    public double area() {
        return radius*radius*PI ;

    }

    @Override
    public double perimeter() {
        return 2*radius*PI;
    }
}
