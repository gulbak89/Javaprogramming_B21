package day40_Constructor;

public class Circle {

    public double radius, diameter, area, perimeter;

    public static double PI;

    static {
        PI=3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
        area = PI*radius*radius;
        perimeter = diameter*PI;
    }


}
class CircleObject{


    public static void main(String[] args) {

        Circle circle1=new Circle(5);
        Circle circle2=new Circle(3);
        Circle circle3=new Circle(2);

        System.out.println(circle1.area);



    }
}