package Bailuyen;

public class Book extends Product{
    private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public double get5FinalPrice() {
        return 0;
    }
}
