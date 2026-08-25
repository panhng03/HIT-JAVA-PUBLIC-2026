package Bai1;

public abstract class Vehicle {
    protected String id;
    protected String name ;
    protected double price;
    private int quantity;
    protected Manufacturer manufacturer;

    public Vehicle(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
    }

    public abstract double getDiscountPrice();
}
