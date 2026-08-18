package BAi2;

import Bai1.Smartphone;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Smartphone phone1 =
                new Smartphone("iPhone 15", 20000000, 10);

        Smartphone phone2 =
                new Smartphone("Samsung S24", 18000000, 5);

        Customer customer =
                new Customer("Phuong");

        customer.addPhone(phone1);
        customer.addPhone(phone2);

        System.out.println("Số sản phẩm ban đầu: "
                + customer.getCart().size());

        ArrayList<Smartphone> cartCopy =
                customer.getCart();

        cartCopy.clear();

        System.out.println("Số sản phẩm sau khi clear: "
                + customer.getCart().size());
    }
}
