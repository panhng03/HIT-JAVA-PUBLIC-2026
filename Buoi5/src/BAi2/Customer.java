package BAi2;

import Bai1.Smartphone;
import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Smartphone> cart;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.cart = new ArrayList<>();
    }

    public void addPhone(Smartphone phone) {
        cart.add(phone);
    }

    public void removePhone(String id) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getId().equals(id)) {
                cart.remove(i);
                return;
            }
        }
    }

    public void removePhone(int index) {
        if (index >= 0 && index < cart.size()) {
            cart.remove(index);
        }
    }

    public ArrayList<Smartphone> getCart() {
        return new ArrayList<>(cart);
    }

    public double calculateTotalBill() {

        double total = 0;

        for (Smartphone phone : cart) {
            total += phone.getFinalPrice();
        }

        return total;
    }
}