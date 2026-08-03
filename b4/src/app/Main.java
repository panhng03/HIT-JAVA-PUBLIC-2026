package app;

import model.ElectronicToy;
import model.PlushToy;
import model.Toy;

public class Main {

    public static void main(String[] args) {
        Toy[] toys = new Toy[3];
        toys[0] = new Toy("T01", "Bộ xếp hình", 250, 20);
        toys[1] = new ElectronicToy("T02", "Robot thông minh", 800, 5, 12);
        toys[2] = new PlushToy("T03", "Gấu bông Teddy", 300, 15, "Bông gòn");
        for (int i = 0; i < toys.length; i++) {
            toys[i].printInfo();
            System.out.println(" ");
        }
    }
}