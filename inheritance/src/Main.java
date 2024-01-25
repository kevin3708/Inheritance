public class Main{
    public static void main(String[] args) {
        Car corolla = new Car("Toyota", "Corolla", "Saloon", 4, "Petrol");
        Car mercedes = new Car("Mercedes", "C200", "Hatchback", 5, "Electric");
        Car nissan = new Car("Nissan", "X-Trail", "SUV", 6, "Diesel");

        Motorcycle bmw = new Motorcycle("BMW", "BMW S 1000 R ", "Naked bike ", 999, 820);
        Motorcycle yamaha = new Motorcycle("Yamaha", "R1", "Naked bike", 998,855);

        Trailer merc = new Trailer("Mercedes", "Actros", "Trailer", 18, 8085);

        Bus isuzu = new Bus("Isuzu","Novo", "Bus",6,27);

        Boat boat = new Boat("Sea Ray", "Sundancer","boat",10.5 ,"Outboard Motor");

        corolla.displayVehicleInfo();
        corolla.startEngine();

        mercedes.displayVehicleInfo();
        mercedes.startEngine();

        nissan.displayVehicleInfo();
        nissan.startEngine();

        bmw.displayVehicleInfo();
        bmw.wheelie();

        yamaha.displayVehicleInfo();
        yamaha.wheelie();

        merc.displayVehicleInfo();
        merc.loadCargo();

        isuzu.displayVehicleInfo();
        isuzu.openDoors();

        boat.displayVehicleInfo();
        boat.startMotor();
        boat.setSail();


    }
}