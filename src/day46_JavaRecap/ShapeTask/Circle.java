package day46_JavaRecap.ShapeTask;

public class Circle extends Shape {

    private double radius, diameters;
    private final static double PI=3.14;



    public Circle(double radius) {
        super("Circle");
        if(radius<=0){
            throw new RuntimeException("No such a circle with a radius of "+radius);
        }
        setRadius(radius);
        setDiameters(radius*2);
    }

    public double getRadius(){
        return radius;
    }

    public double getDiameters(){
        return diameters;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public void setDiameters(double diameters){
        this.diameters=diameters;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return diameters*PI;
    }
}
