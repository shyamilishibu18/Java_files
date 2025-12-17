// Abstract class Vehicle
abstract class Vehicle {

    double distance;      // in kilometers
    double time;          // in hours
    double displacement;  // in kilometers

    // Constructor
    Vehicle(double distance, double displacement, double time) {
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;
    }

    // Abstract methods
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

// Car class extending Vehicle
class Car extends Vehicle {

    Car(double distance, double displacement, double time) {
        super(distance, displacement, time);
    }

    @Override
    double calculateSpeed() {
        return distance / time;
    }

    @Override
    double calculateVelocity() {
        return displacement / time;
    }
}

// Bike class extending Vehicle
class Bike extends Vehicle {

    Bike(double distance, double displacement, double time) {
        super(distance, displacement, time);
    }

    @Override
    double calculateSpeed() {
        return distance / time;
    }

    @Override
    double calculateVelocity() {
        return displacement / time;
    }
}

// Main class
public class VehiclePro {

    public static void main(String[] args) {

        Vehicle car = new Car(100, 80, 2);   // 100 km distance, 80 km displacement, 2 hours
        Vehicle bike = new Bike(40, 35, 1);  // 40 km distance, 35 km displacement, 1 hour

        System.out.println("Car Speed: " + car.calculateSpeed() + " km/h");
        System.out.println("Car Velocity: " + car.calculateVelocity() + " km/h");

        System.out.println();

        System.out.println("Bike Speed: " + bike.calculateSpeed() + " km/h");
        System.out.println("Bike Velocity: " + bike.calculateVelocity() + " km/h");
    }
}
