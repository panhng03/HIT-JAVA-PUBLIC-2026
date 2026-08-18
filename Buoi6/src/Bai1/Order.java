package Bai1;


import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<Product> items;
    private int count = 0;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }
    public void addproduct(Product p){
        items.add(p);
    }

    public double getTotal(){
        double total = 0;
        for(Product p: items){
            total += p.getPrice();
        }
        return total;
    }

    public void printInvoice(){
        System.out.println("Thong tin khach hang" + customer.getName() + customer.getPhone());
        System.out.println("Danh sach san pham");
        for(Product p : items){
            System.out.println("-" + p.getName() + p.getPrice());
        }
        System.out.println("Tong tien" + getTotal());
    }

}
