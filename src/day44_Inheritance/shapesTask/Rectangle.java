package day44_Inheritance.shapesTask;

public class Rectangle extends Shape{

    public double width, length;


    public Rectangle(double width, double length){
        super("Rectangle");
        this.width=width;
        this.length=length;

    }


    public double calArea(){
        return width*length;
    }

    public double calPerimeter(){
        return (width+length)*2;
    }









}
