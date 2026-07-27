package ProductMangement;

public class Product {
    //  thuoc tinh
    private String id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // khong tham so khi vo danh, khong muon truyen vao
    public Product(){}

    //getter, setter, private chi su dung trong class rieng cua no, khong sd trong class khac
    //khai bao protected thi chi cung package moi truy cap duoc
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }

    //phai co gia tri moi gan gia tri khac duoc
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}
