public class Bus extends Vehicle {
    private int numberOfWheels;
    private int capacity;

    public Bus(String make, String model, String type, int numberOfWheels, int capacity){
        super(make, model, type);
        this.numberOfWheels = numberOfWheels;
        this.capacity = capacity;
    }
    @Override
    public void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Number of wheels: " +numberOfWheels+ ", Capacity: " +capacity);

    }

    public void openDoors(){
        System.out.println("Bus doors are now open");
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
}


