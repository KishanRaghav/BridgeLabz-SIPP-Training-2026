public class Vehicle {
    private String vehicleNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void display() {
        System.out.println(vehicleNumber + " - " + ownerName + " - " + vehicleType);
    }

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("\nBikes:");
        for (Vehicle v : vehicles) {
            if (v.getVehicleType().equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("UP01", "Rahul", "Car"),
                new Vehicle("UP02", "Aman", "Bike"),
                new Vehicle("UP03", "Riya", "Car"),
                new Vehicle("UP04", "Priya", "Bike"),
                new Vehicle("UP05", "Rohan", "Car"),
                new Vehicle("UP06", "Neha", "Bike"),
                new Vehicle("UP07", "Amit", "Car"),
                new Vehicle("UP08", "Pooja", "Bike"),
                new Vehicle("UP09", "Karan", "Car"),
                new Vehicle("UP10", "Ankit", "Bike")
        };

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}