package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Product> products = new ArrayList<>();
        products.add(new Book("B01", "Harry Potter", 100000, "J. K. Rowling", 400));
        products.add(new Book("B02", "Chang vang", 20000, "Melissa Rosenberg", 500));
        products.add(new Electronic("E01", "Laptop", 18000000, 12));
        products.add(new Electronic("E02", "Dien thoai", 25000000, 12));
        products.add(new Food("F01", "muffin", 58000, "13/03/2027"));

        double totalPrice = 0;
        double totalFinalPrice = 0;
        for(Product p: products){
            p.showInfo();
            System.out.println(p);
            System.out.println(" ");
            totalPrice += p.price;
            totalFinalPrice += p.getDiscountedPrice();
        }
        System.out.println("Tong gia goc: "+ totalPrice);
        System.out.println("Gia tien sau khi giam: "+ totalFinalPrice);
    }
}
