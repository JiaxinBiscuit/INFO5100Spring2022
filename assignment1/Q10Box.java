public class Q10Box {
    double width;
    double height;
    double depth;

    public Q10Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public double calculateVolume(){
        double volume = width*height*depth;
        return volume;
    }

}
