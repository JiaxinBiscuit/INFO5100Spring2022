package Q2;

public class Parallelogram extends Shape {
    int base;
    int height;
    int side;

    public Parallelogram(int base, int height, int side, String color){
        super("Parallelogram", color);
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Parallelogram(int side, String color){
        super("Parallelogram", color);
        this.base = side;
        this.height = side;
        this.side = side;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        int area = (base+base)*height/2;
        return area;
    }

    @Override
    public int getPerimeter(){
        int perimeter = base * 4;
        return perimeter;
    }

}
