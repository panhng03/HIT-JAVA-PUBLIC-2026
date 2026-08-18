package Bai1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Phuong anh", "0396042487", "Nguyen xa");
        Order order = new Order("3", customer);
        Product product1 = new Product("Tuyet", 123, 12, "123");
        Product product2 = new Product("Na", 1234, 3, "1234");
        Product product3 = new Product("Thu", 345, 5, "12356");

        order.addproduct(product1);
        order.addproduct(product2);
        order.addproduct(product3);

        order.printInvoice();
    }
}
