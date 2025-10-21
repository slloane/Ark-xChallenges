package Challenges.POOPrinciples.VehicleRentalSystem;

public class Vehicle {
    private String make;
    private String model;
    private float rentalPrice;
    private Boolean isAvailable;

    public Vehicle(String make) {
        this.make = make;
    }

    public Vehicle(String make, String model, float rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isAvailable = true;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public float getRentalPrice() {
        return rentalPrice;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String toString(){
        System.out.println("This vehicle has the following properties :"+"make : " +this.getMake() +"model: "+this.model+"rental price " +this.rentalPrice);
        return "This vehicle has the following properties :\"+\"make : \" +this.getMake() +\"model: \"+this.model+\"rental price \" +this.rentalPrice";
    }
}
