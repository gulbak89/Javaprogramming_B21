package day40_Constructor;

public class Rectangle {

    public double width,length,area,perimeter;

    public static int numOfSide;
    static{
        numOfSide=4;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        area = width*length;
        perimeter = (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", number of sides="+numOfSide+
                '}';
    }
}


class RectangleObject{
    public static void main(String[] args) {


        Rectangle rec1=new Rectangle(3,5);
        Rectangle rec2=new Rectangle(3,4);
        Rectangle rec3=new Rectangle(6,8);


        System.out.println(rec1.area);
        System.out.println(rec1.perimeter);
        System.out.println(Rectangle.numOfSide);
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);
    }
}
