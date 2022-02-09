public class Q9Book {
    String name;
    int bookID;
    String genres;
    double price;

    public Q9Book(String n, int id, String g, double p){
        this.name = n;
        this.bookID = id;
        this.genres = g;
        this.price = p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getBookID() {
        return bookID;
    }

    public String getGenres() {
        return genres;
    }

    public double getPrice() {
        return price;
    }
}
