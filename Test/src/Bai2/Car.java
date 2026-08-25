package Bai2;

import Bai1.Manufacturer;
import Bai1.Vehicle;


public abstract class Car extends Vehicle {
    public Car(String id, String name, double price, int quantity, Manufacturer manufacturer) {
        super(id, name, price, quantity, manufacturer);
    }
    private boolean luxury;

    public boolean isLuxury() {
        return luxury;
    }

    public void setLuxury(boolean luxury) {
        this.luxury = luxury;
    }

    public double getDiscountPrice(){
        return price;
    }

    public void logluxury(){
        if(luxury = true){
            System.out.println("Ten nha san xuat: " + manufacturer.getName());
        }
    }
}
