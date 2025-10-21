package Challenges.POOPrinciples.VehicleRentalSystem;

public class Car extends Vehicle{
    private int nbreChevaux;

    public Car(String make, int nbreChevaux) {
        super(make);
        this.nbreChevaux = nbreChevaux;
    }

    public Car(String make, String model, float rentalPrice, int nbreChevaux) {
        super(make, model, rentalPrice);
        this.nbreChevaux = nbreChevaux;
    }

    public int getNbreChevaux() {
        return nbreChevaux;
    }

    public void setNbreChevaux(int nbreChevaux) {
        this.nbreChevaux = nbreChevaux;
    }



    public String toString(){
        return "This car has the following properties :"+ this.nbreChevaux;
    }
}
