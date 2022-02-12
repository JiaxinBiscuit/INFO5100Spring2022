package Q3;

public class Circle extends Shape {
    double radius;

    public Circle(){
        super();
        name = "Circle";
    };

    public Circle(double r){
        super();
        radius = r;
        name = "Circle";
    }

    public double computeArea(){
        area = 3.14*radius*radius;
        return area;
    }

    public double computePerimeter(){
        perimeter = 2* 3.14 * radius;
        return perimeter;
    }


}
