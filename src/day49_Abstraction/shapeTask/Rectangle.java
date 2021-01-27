package day49_Abstraction.shapeTask;

public final class Rectangle extends Shape {

    public double width,length;

    public Rectangle( double width, double length) {
        super("Rectangle");

        if(width<=0 || length<=0){
            throw new RuntimeException("No such rectangle");
        }
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
