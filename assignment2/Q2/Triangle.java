package Q2;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int side,String color){
        super("Triangle", color);
        base = side;
        height = side;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        int area = base*height/2;
        return area;
    }

    @Override
    public int getPerimeter(){
        int perimeter = base * 3;
        return perimeter;
    }




}
