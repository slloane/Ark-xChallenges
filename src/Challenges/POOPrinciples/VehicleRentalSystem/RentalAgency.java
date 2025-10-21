package Challenges.POOPrinciples.VehicleRentalSystem;

import java.util.ArrayList;

public class RentalAgency {
    public ArrayList<Vehicle> vehicles;

    public RentalAgency(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
    public void rentVehicle(String model) {
        for (Vehicle v : vehicles) {
            if (v.getModel().equalsIgnoreCase(model) && v.getAvailable()) {
                v.setAvailable(false);
                System.out.println("Vehicle rented: " + v.getMake() + " " + v.getModel());
                return;
            }
        }
        System.out.println("Vehicle not available for rent: " + model);
    }
    public void displayAvailableVehicles() {
        System.out.println("Available vehicles:");
        for (Vehicle v : vehicles) {
            if (v.getAvailable()) {
                String v1 = v.toString();
                System.out.println(v1);// Polymorphic call
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles1 = new ArrayList<>();
        RentalAgency rentalAgency = new RentalAgency(vehicles1);

        Vehicle v1 = new Car("toyota","6564",70000.0f,6);
        Vehicle bike1 = new Bike("m1","model1",5000.0f,"byciclette",true);
        rentalAgency.addVehicle(v1);
        rentalAgency.addVehicle(bike1);

        rentalAgency.rentVehicle("m1");
        rentalAgency.displayAvailableVehicles();

    }
}
