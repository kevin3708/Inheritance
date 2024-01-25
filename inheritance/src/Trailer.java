public class Trailer extends Vehicle{
    private int numberOfWheels;
    private int cargoWeight;

    public Trailer(String make, String model, String type, int numberOfWheels, int cargoWeight){
        super(make, model, type);
        this.numberOfWheels = numberOfWheels;
        this.cargoWeight = cargoWeight;
    }
    @Override
    public void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Number of wheels: " +numberOfWheels+ ", Cargo Weight: " +cargoWeight);

    }

    public void loadCargo(){
        System.out.println("Cargo is being loaded onto the trailer");
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getCargoWeight(){
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight){
        this.cargoWeight = cargoWeight;
    }
}
