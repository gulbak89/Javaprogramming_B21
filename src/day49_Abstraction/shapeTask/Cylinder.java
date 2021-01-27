package day49_Abstraction.shapeTask;

public final class Cylinder extends Shape implements Volume {

    public double radius, length;
    public final static double PI=3.14;

    public Cylinder( double radius, double length) {
        super("Cylinder");
        if(radius<=0 || length<=0){
            throw new RuntimeException("No such Cylinder");
        }

        this.radius = radius;
        this.length = length;
    }

    @Override
    public double area() {
        return (radius*radius*PI*2)+length*radius*2*PI;
    }

    @Override
    public double perimeter() {
        return new Circle(radius).perimeter()*length;
    }

    @Override
    public double volume() {
        return new Circle(radius).area()*length;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "are='" + df.format(area()) + '\'' +
                "perimeter='" + df.format(perimeter()) + '\'' +
                "volume='" + df.format(volume()) + '\'' +
                '}';
    }

}

