class Boat extends Vehicle {
    double length;
    String propulsionType;

    public Boat(String make, String model, String type,  double length, String propulsionType) {
        super(make, model ,type);
        this.length = length;
        this.propulsionType = propulsionType;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Length: " + length + " meters");
        System.out.println("Propulsion Type: " + propulsionType);

    }

    public void startMotor() {
        System.out.println("The boat motor is now running.");
    }

    public void setSail() {
        System.out.println("The boat is setting sail.");
    }
}