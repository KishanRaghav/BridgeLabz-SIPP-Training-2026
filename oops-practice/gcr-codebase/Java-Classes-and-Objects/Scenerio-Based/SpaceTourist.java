public class SpaceTourist {
    private static int totalReservations = 0;
    private static String missionName = "Mars Explorer";

    private String touristName;
    private int seatNumber;

    public SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName;
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    public SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public void displayDetails() {
        System.out.println("Tourist: " + touristName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Mission: " + missionName);
    }

    public static void main(String[] args) {
        SpaceTourist tourist = new SpaceTourist("Rahul", 5);

        tourist.updateSeatNumber(10)
               .updateSeatNumber(15);

        tourist.displayDetails();

        System.out.println("Total Reservations: " + totalReservations);
    }
}