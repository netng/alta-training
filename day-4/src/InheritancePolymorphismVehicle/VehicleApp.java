package InheritancePolymorphismVehicle;

import Encapsulation.Car.Car;

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Gerobak", "no engine");

        Vehicle pedalBikes = new Bikes("Pedal Bikes", "no engine", 2);
        Vehicle motorBikes = new Bikes("Motor Bikes", "with engine", 2);

        Vehicle sportCar = new Cars("Sport Car", "with engine", 4, "V8" );
        Vehicle pickupCar = new Cars("Pickup Car", "with engine", 4, "Solar" );

        Vehicle transJakarta = new Buses("Trans Jakarta", "with engine", 4, "Public Bus");
        Vehicle schoolBus = new Buses("School Bus", "with engine", 4, "Private Bus");

        vehicle.identifyMySelf();
        System.out.println();

        pedalBikes.identifyMySelf();
        motorBikes.identifyMySelf();
        System.out.println();

        sportCar.identifyMySelf();
        pickupCar.identifyMySelf();
        System.out.println();

        transJakarta.identifyMySelf();
        schoolBus.identifyMySelf();
    }
}
