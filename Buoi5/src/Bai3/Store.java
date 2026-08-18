package Bai3;

import java.util.ArrayList;
import Bai1.Smartphone;
import BAi2.Customer;

public class Store {

    private ArrayList<Smartphone> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }

    public void addPhoneToStore(Smartphone phone) {
        inventory.add(phone);
    }

    public Smartphone search(String id) {

        for (Smartphone phone : inventory) {
            if (phone.getId().equals(id)) {
                return phone;
            }
        }

        return null;
    }

    public ArrayList<Smartphone> search(
            double minPrice, double maxPrice) {

        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone phone : inventory) {

            if (phone.getPrice() >= minPrice
                    && phone.getPrice() <= maxPrice) {

                result.add(phone);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> search(
            String keyword, boolean isName) {

        ArrayList<Smartphone> result = new ArrayList<>();

        for (Smartphone phone : inventory) {

            if (phone.getName().equalsIgnoreCase(keyword)) {
                result.add(phone);
            }
        }

        return result;
    }

    public ArrayList<Smartphone> searchName(String keyword) {
        return search(keyword, true);
    }

    public void sellPhone(
            Customer customer, String phoneId) {

        Smartphone phone = search(phoneId);

        if (phone != null && phone.getStock() > 0) {

            phone.setStock(phone.getStock() - 1);

            customer.addPhone(phone);

            System.out.println("Ban hang thanh cong!");

        } else {
            System.out.println("Khong the ban!");
        }
    }

    public double calculateInventoryValue() {

        double total = 0;

        for (Smartphone phone : inventory) {

            total += phone.getFinalPrice()
                    * phone.getStock();
        }

        return total;
    }
}
