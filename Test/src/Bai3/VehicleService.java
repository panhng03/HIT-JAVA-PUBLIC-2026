package Bai3;


import Bai1.Vehicle;

import java.util.List;

public interface VehicleService {
    void addVehicle(Vehicle vehicle);
    boolean updateVehicle(String id, Vehicle newvehicle);
    boolean deleteVehicle(String id);
    List<Vehicle> searchByName(String name);
    void sortByPrice(boolean ascending);
    void displayAllVehicles();
}
