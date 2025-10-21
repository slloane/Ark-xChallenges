package Challenges.POOPrinciples.VehicleRentalSystem;

public class Bike extends Vehicle{
    private String type;
    private boolean helmetIncluded;

    public Bike(String make, String type, boolean helmetIncluded) {
        super(make);
        this.type = type;
        this.helmetIncluded = helmetIncluded;
    }

    public Bike(String make, String model, float rentalPrice, String type, boolean helmetIncluded) {
        super(make, model, rentalPrice);
        this.type = type;
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public String toString(){
        super.toString();
        return "This bike has the following properties :"+ this.type ;
    }
}
