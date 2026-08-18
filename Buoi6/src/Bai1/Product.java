package Bai1;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity, String id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
