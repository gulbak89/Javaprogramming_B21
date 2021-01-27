package day49_Abstraction.shapeTask;

public final class Cube extends Shape implements Volume {

    public double edge;

    public Cube( double edge) {
        super("Cube");

        if(edge<=0){
            throw new RuntimeException("No such Cube with a edge of "+edge);
        }
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6*edge*edge;
    }

    @Override
    public double perimeter() {
        return 12*edge;
    }

    @Override
    public double volume() {
        return edge*edge*edge;
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
