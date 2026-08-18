package Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address(
                "63/29 Tran Quoc Vuong",
                "Ha Noi",
                "100000"
        );

        Address address2 = new Address(
                "32 Yen Hoa",
                "Ha Noi",
                "100000"
        );

        Address address3 = new Address(
                "132 Cau Dien",
                "Ha Noi",
                "100000"
        );

        List<Account> accounts = new ArrayList<>();

        accounts.add(new NormalAccount(
                "U1",
                "u1@gmail.com",
                address1
        ));

        accounts.add(new VipAccount(
                "U2",
                "u2@gmail.com",
                address2,
                500
        ));

        accounts.add(new VipAccount(
                "u3",
                "u3@gmail.com",
                address3,
                1500
        ));

        double orderValue = 2000000;

        for (Account account : accounts) {

            double discount = account.getDiscount();
            double finalPrice = orderValue * (1 - discount);

            System.out.println(account);
            System.out.println("Muc giam gia: "
                    + (discount * 100) + "%");
            System.out.println("Tien phai tra: "
                    + finalPrice);
            System.out.println(" ");
        }
    }
}


