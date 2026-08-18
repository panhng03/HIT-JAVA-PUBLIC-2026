package Bai1;

public class Main {
    public static void main(String[] args) {

        Smartphone phone1 =
                new Smartphone("iPhone 15", 20000000, 10);

        Smartphone phone2 =
                new Smartphone("Samsung S24", 18000000, 5);

        Smartphone phone3 =
                new Smartphone("Xiaomi 14", 12000000, 8);

        System.out.println("ID điện thoại 1: " + phone1.getId());
        System.out.println("ID điện thoại 2: " + phone2.getId());
        System.out.println("ID điện thoại 3: " + phone3.getId());

        System.out.println("Tổng số điện thoại: "
                + Smartphone.getTotalPhones());
    }
}
