package Q2;

public class Rhombus extends Shape {
    int diagonal1;
    int diagonal2;

    public Rhombus(int d1, int d2, String color){
        super("Rhombus", color);
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Rhombus(int d1,String color){
        super("Rhombus", color);
        this.diagonal1= d1;
        this.diagonal2 = d1;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    @Override
    public int getArea() {
        int area = diagonal1 * diagonal2/2;
        return area;
    }

    @Override
    public double getPerimeter(){
        double perimeter = 4 * Math.sqrt(Math.pow(diagonal1/2, 2)+Math.pow(diagonal2/2, 2));
        return perimeter;
    }

}
