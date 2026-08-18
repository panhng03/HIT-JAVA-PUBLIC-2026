package ProductMangement;

public class Product {
    //  thuoc tinh
    private String id;    access modifier
    private String name;      protected: cung package thi truy cap duoc
                              public: khac package cung truy cap duoc
    private double price;
    private int quantity;

    // Constructor co tham so
    public Product(String id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // khong tham so khi vo danh, khong muon truyen vao, chi muon khoi tao va gan data sau
    public Product(){}

    //getter, setter, private chi su dung trong class rieng cua no, khong sd trong class khac
    //khai bao protected thi chi cung package moi truy cap duoc
    public String getId(){  // khoi tao can gan du lieu, de public linh hoat voi package khac
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
