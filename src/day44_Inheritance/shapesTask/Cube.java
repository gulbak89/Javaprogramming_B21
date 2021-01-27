package day44_Inheritance.shapesTask;

public class Cube extends Shape {

    public double side;

    public Cube(double side){
        super("Cube");
        this.side=side;

    }

    public double calArea(){
        return new Square(side).calArea()*6;
    }

    public double calPerimeter(){
        return side*12;
    }
}
