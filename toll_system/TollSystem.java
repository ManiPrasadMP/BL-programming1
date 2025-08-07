package objectOriented.toll_system;
import java .util.Scanner;

public class TollSystem {
    private static final int MAX_VEHICLES = 10;
    private static Vehicle[] vehicleRecords = new Vehicle[MAX_VEHICLES];
    private static int vehicleCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("welcome to NH34");
        do {
            System.out.println("1. Enter Bike");
            System.out.println("2. Enter Car");
            System.out.println("3. Enter Truck");
            System.out.println("4. Show All Vehicles");
            System.out.println("5. Show Total Revenue");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addVehicle(new Bike(getPlate(sc), getDuration(sc)));
                    break;
                case 2:
                    addVehicle(new Car(getPlate(sc), getDuration(sc)));
                    break;
                case 3:
                    addVehicle(new Truck(getPlate(sc), getDuration(sc)));
                    break;
                case 4:
                    showAllVehicles();
                    break;
                case 5:
                    showTotalRevenue();
                    break;
                case 6:
                    System.out.println("Exiting Toll Booth System.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    private static String getPlate(Scanner sc) {
        System.out.print("Enter plate number: ");
        sc.nextLine();
        return sc.nextLine();
    }

    private static int getDuration(Scanner sc) {
        System.out.print("Enter duration of stay (in minutes): ");
        return sc.nextInt();
    }

    private static void addVehicle(Vehicle v) {
        if (vehicleCount < MAX_VEHICLES) {
            vehicleRecords[vehicleCount++] = v;
            System.out.println("Vehicle recorded successfully.");
        } else {
            System.out.println("Parking full. Cannot accept more vehicles.");
        }
    }

    private static void showAllVehicles() {
        if (vehicleCount == 0) {
            System.out.println("No vehicles recorded.");
            return;
        }
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicleRecords[i].displayDetails();
        }
    }

    private static void showTotalRevenue() {
        double total = 0;
        for (int i = 0; i < vehicleCount; i++) {
            total += vehicleRecords[i].getTollAmount();
        }
        System.out.println("Total Revenue Collected: Rs." + total);
    }
}
