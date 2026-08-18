package Bai2;

public class Product {
    protected String id;
    protected String name;
    protected double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getDiscountedPrice() {
        return price;
    }

     public void showInfo(){
        System.out.println("Ma: "+ id);
        System.out.println("Ten: " + name);
        System.out.println("Gia: "+ price);
        System.out.println("Gia sau giam: "+ getDiscountedPrice());
     }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
