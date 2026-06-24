public class WaterBottle {
    private String ownerName;
    private int dailyTarget;

    public WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    public void displayBottleInfo() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
        System.out.println();
    }

    public static void main(String[] args) {
        WaterBottle b1 = new WaterBottle("Rahul", 3000);
        WaterBottle b2 = new WaterBottle("Priya", 2500);

        b1.displayBottleInfo();
        b2.displayBottleInfo();
    }
}