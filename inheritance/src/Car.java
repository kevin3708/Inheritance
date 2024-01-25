public class Car extends Vehicle {
    private int numberOfDoors;
    private String engineType;

    public Car(String make, String model, String type, int numberOfDoors, String engineType) {
        super(make, model, type); // Constructor chaining
        this.numberOfDoors = numberOfDoors;
        this.engineType = engineType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo(); // Calling Vehicle's displayInfo
        System.out.println("Number of Doors: " + numberOfDoors + ", Engine Type: " + engineType);

    }

    public void startEngine(){
        System.out.println("The engine is now running");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}