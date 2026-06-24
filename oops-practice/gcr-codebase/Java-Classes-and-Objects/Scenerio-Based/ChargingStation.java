public class ChargingStation {
    private static int totalStations = 0;
    private static double electricityRate = 8.5;

    private String stationId;
    private double unitsConsumed;

    public ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    public double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    public void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units: " + unitsConsumed);
        System.out.println("Bill: " + calculateBill());
        System.out.println();
    }

    public static void setElectricityRate(double rate) {
        electricityRate = rate;
    }

    public static void main(String[] args) {
        ChargingStation s1 = new ChargingStation("S1", 100);
        ChargingStation s2 = new ChargingStation("S2", 120);
        ChargingStation s3 = new ChargingStation("S3", 150);
        ChargingStation s4 = new ChargingStation("S4", 180);
        ChargingStation s5 = new ChargingStation("S5", 200);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + totalStations);

        setElectricityRate(10);

        System.out.println("\nAfter Rate Change\n");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}