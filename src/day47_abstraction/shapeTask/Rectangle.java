package day47_abstraction.shapeTask;

public class Rectangle extends Shape {
    public double width,length;

    public Rectangle(double width,double length) {
        super("Rectangle");
        this.width=width;
        this.length=length;

    }

    @Override
    public double calArea() {
        return width*length;
    }

    @Override
    public double calPerimeter() {
        return (width+length)*2;
    }
}
