package day44_Inheritance.shapesTask;

public class Shape {

    public String name;
    public final static boolean isShape, hasArea, hasPerimeter;

    static{
        isShape=true;
        hasArea=true;
        hasPerimeter=true;

    }

    public Shape(String name){

        this.name=name;
    }


    public double calArea(){
        return 0;
    }

    public double calPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", Area="+calArea()+
                ", Perimeter="+calPerimeter()+
                '}';
    }
}
