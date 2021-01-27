package day41_Encapsulation;

public class Circle {

    private double radius, diameter, area,perimeter;
    private final  static double PI;        // final keyword makes the variable constant variable

    static {
        PI=3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter=radius*2;
        area=calArea();
        perimeter=calPerimere();
    }

    private double calArea(){
        return radius*radius*PI;
    }

    private double calPerimere(){
        return diameter*PI;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public static double getPI() {
        return PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter=2*radius;
        perimeter=calPerimere();
        area=calArea();

    }


}
