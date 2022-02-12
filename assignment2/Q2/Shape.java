package Q2;

public class Shape {
    String name;
    String color;
    int area;
    int perimeter;

    public Shape (String n, String c){
        name = n;
        color = c;
    }


    public int getArea() {
        return area;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public void printShape(){
        System.out.println(name);
    }


}
