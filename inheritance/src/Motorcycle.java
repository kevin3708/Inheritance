public class Motorcycle extends Vehicle {
    private int cubicCapacity;
    private int seatHeight;

    public Motorcycle(String make, String model, String type, int cubicCapacity, int seatHeight){
        super(make, model, type);
        this.cubicCapacity = cubicCapacity;
        this.seatHeight = seatHeight;
    }

    @Override
    public void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Cubic Capacity: " +cubicCapacity+ ",Seat Height: " + seatHeight);

    }

    public void wheelie() {
        System.out.println("The motorcycle is doing a wheelie!");
    }

    public int getCubicCapacity(){
        return cubicCapacity;
    }
    public void setCubicCapacity(int cubicCapacity){
        this.cubicCapacity = cubicCapacity;
    }

    public int getSeatHeight(){
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
