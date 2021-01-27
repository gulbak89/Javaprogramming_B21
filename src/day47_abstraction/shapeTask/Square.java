package day47_abstraction.shapeTask;

public class Square extends Shape {
    public double side;

    public Square( double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calArea() {// method overridden: MUST happen in the sub class; cannot be override private, static, and final methods; access modifier should be same or more visible.
        return side*side;
    }

    @Override
    public double calPerimeter() {
        return side*4;
    }
}
