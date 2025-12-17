abstract class Vehicle {

    double distance;      
    double time;          
    double displacement;  

    Vehicle(double distance, double displacement, double time) {
        this.distance = distance;
        this.displacement = displacement;
        this.time = time;
    }

    abstract double calculateSpeed();
    abstract double calculateVelocity();
}

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

public class VehicleDemo {

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
