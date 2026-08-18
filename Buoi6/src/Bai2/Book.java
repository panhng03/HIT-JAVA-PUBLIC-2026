package Bai2;

public class Book extends Product{
    private String author;
    private int pages;

    public Book(String id, String name, double price, String author, int pages) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public double getDiscountedPrice() {
        return price*0.9;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("author: "+ author);
        System.out.println("Pages: "+ pages);

    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
