package Bai5;

import Bai1.Smartphone;
import BAi2.Customer;
import Bai3.Store;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();
        Customer customer = new Customer("Anh Toan");
        Smartphone phone1 =
                new Smartphone("iPhone 15", 20000000, 10);

        Smartphone phone2 =
                new Smartphone("Samsung S24", 15000000, 5);

        Smartphone phone3 =
                new Smartphone("Xiaomi 14", 10000000, 8);

        store.addPhoneToStore(phone1);
        store.addPhoneToStore(phone2);
        store.addPhoneToStore(phone3);

        store.sellPhone(customer, phone1.getId());
        store.sellPhone(customer, phone2.getId());

        System.out.println("VAT ban dau: 10%");

        System.out.println(
                "Tong tien khach phai tra: "
                        + customer.calculateTotalBill()
        );

        System.out.println(
                "Gia tri kho hang: "
                        + store.calculateInventoryValue()
        );

        System.out.println("\nVAT moi: 8%");

        Smartphone.setVatTax(0.08);

        System.out.println(
                "Tong tien khach phai tra: "
                        + customer.calculateTotalBill()
        );

        System.out.println(
                "Gia tri kho hang: "
                        + store.calculateInventoryValue()
        );
    }
}
