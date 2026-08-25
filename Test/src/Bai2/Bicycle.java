package Bai2;

import Bai1.Manufacturer;
import Bai1.Vehicle;

public abstract class Bicycle extends Vehicle{
    public Bicycle(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, manufacturer);
    }
    public double getDiscountPrice(){
        return getDiscountPrice() * 0.85;
    }

}

