import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static HashMap<String, List<Astronaut>> missions = new HashMap<>();
    static HashMap<String, HashSet<String>> assignedIds = new HashMap<>();

    public static void addMission(String missionName) {

        if (missions.containsKey(missionName)) {
            System.out.println("Mission Already Exists.");
            return;
        }

        missions.put(missionName, new ArrayList<>());
        assignedIds.put(missionName, new HashSet<>());

        System.out.println("Mission Added Successfully.");
    }

    public static void assignAstronaut(String missionName, Astronaut astronaut) {

        if (!missions.containsKey(missionName)) {
            System.out.println("Mission Not Found.");
            return;
        }

        HashSet<String> ids = assignedIds.get(missionName);

        if (ids.contains(astronaut.getAstronautId())) {
            System.out.println("Astronaut Already Assigned To This Mission.");
            return;
        }

        missions.get(missionName).add(astronaut);
        ids.add(astronaut.getAstronautId());

        System.out.println("Astronaut Assigned Successfully.");
    }

    public static void displayMissions() {

        if (missions.isEmpty()) {
            System.out.println("No Missions Available.");
            return;
        }

        System.out.println("\n===== Mission Details =====");

        for (Map.Entry<String, List<Astronaut>> entry : missions.entrySet()) {

            System.out.println("\nMission : " + entry.getKey());

            List<Astronaut> crew = entry.getValue();

            if (crew.isEmpty()) {
                System.out.println("No Astronauts Assigned.");
            } else {

                for (Astronaut astronaut : crew) {
                    System.out.println(astronaut);
                    System.out.println("----------------------");
                }

                System.out.println("Total Astronauts : " + crew.size());
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Space Mission Crew Management System =====");
            System.out.println("1. Add Mission");
            System.out.println("2. Assign Astronaut");
            System.out.println("3. Display Missions");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Mission Name : ");
                    addMission(sc.nextLine());
                    break;

                case 2:

                    System.out.print("Enter Mission Name : ");
                    String mission = sc.nextLine();

                    System.out.print("Enter Astronaut ID : ");
                    String id = sc.nextLine();

                    System.out.print("Enter Astronaut Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Specialization : ");
                    String specialization = sc.nextLine();

                    Astronaut astronaut = new Astronaut(id, name, specialization);

                    assignAstronaut(mission, astronaut);
                    break;

                case 3:

                    displayMissions();
                    break;

                case 4:

                    System.out.println("Thank You.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}