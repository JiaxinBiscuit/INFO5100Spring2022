package Q3;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(){
        super();
        name = "Rectangle";
    };

    public Rectangle(double l, double w){
        super();
        length = l;
        width = w;
        name = "Rectangle";
    }

    public void computeArea(){
        area = length*width;
    }

    public void computePerimeter(){
        perimeter = (length + width)*2;
    }





}
