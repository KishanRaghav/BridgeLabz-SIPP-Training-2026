abstract class Vehicle {
    public abstract double fuelCost(double km);
}

class Car extends Vehicle {
    public double fuelCost(double km) {
        return km * 8.0;
    }
}

class Bus extends Vehicle {
    public double fuelCost(double km) {
        return km * 15.0;
    }
}

class Bike extends Vehicle {
    public double fuelCost(double km) {
        return km * 3.0;
    }
}

class ElectricCar extends Vehicle {
    public double fuelCost(double km) {
        return km * 2.0;
    }
}

public class TransportCompany {
    public static void main(String[] args) {
        Vehicle[] fleet = {
            new Car(),
            new Bus(),
            new Bike(),
            new ElectricCar()
        };

        double km = 100;

        for (Vehicle vehicle : fleet) {
            System.out.println("Fuel Cost: " + vehicle.fuelCost(km));

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Type: Car");
            } else if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                System.out.println("Type: Bus");
            } else if (vehicle instanceof Bike) {
                Bike bike = (Bike) vehicle;
                System.out.println("Type: Bike");
            } else if (vehicle instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) vehicle;
                System.out.println("Type: Electric Car");
            }

            System.out.println();
        }
    }
}