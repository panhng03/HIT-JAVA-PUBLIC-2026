package Bai3;

import java.util.ArrayList;
import Bai1.Smartphone;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        Smartphone phone1 =
                new Smartphone("iPhone 15", 20000000, 10);

        Smartphone phone2 =
                new Smartphone("Samsung S24", 18000000, 5);

        Smartphone phone3 =
                new Smartphone("Xiaomi 14", 12000000, 8);

        Smartphone phone4 =
                new Smartphone("Oppo Reno", 9000000, 6);

        Smartphone phone5 =
                new Smartphone("iPhone 13", 15000000, 4);

        store.addPhoneToStore(phone1);
        store.addPhoneToStore(phone2);
        store.addPhoneToStore(phone3);
        store.addPhoneToStore(phone4);
        store.addPhoneToStore(phone5);

        Smartphone result1 = store.search("SP1");

        if (result1 != null) {
            System.out.println("Tìm thấy: "
                    + result1.getName());
        } else {
            System.out.println("Không tìm thấy!");
        }

        ArrayList<Smartphone> result2 =
                store.search(10000000, 20000000);

        System.out.println("Điện thoại từ 10 triệu đến 20 triệu:");

        for (Smartphone phone : result2) {
            System.out.println(phone.getName()
                    + " - " + phone.getPrice());
        }

        ArrayList<Smartphone> result3 =
                store.search("iPhone 13", true);

        System.out.println("Tìm theo tên:");

        for (Smartphone phone : result3) {
            System.out.println(phone.getName()
                    + " - " + phone.getPrice());
        }
    }
}