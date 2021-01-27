package day44_Inheritance.shapesTask;

public class Triangle extends Shape {

    public double height, base, side;


    public Triangle(double height, double base, double side) {
        super("Triangle");  // subClass must call superClass constructor
        this.height = height;
        this.base = base;
        this.side=side;
    }



    public double calArea(){
        return height*base/2;
    }

    public double calPerimeter(){
        return side*2+base;
    }




}
