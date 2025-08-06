package objectOriented.parking_slots;

import java.util.Scanner;

public class TestParking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the available slots");
		ParkingArea pa = new ParkingArea(sc.nextInt());

		while (true) {
			System.out.println("Enter 1 - park vehicle");
			System.out.println("Enter 2 - remove vehicle");
			System.out.println("Enter 3 - view total amount ");
			System.out.println("Enter 4 - view total vehicles ");
			System.out.println("Enter 5 - exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				if(pa.slots==0) {
					System.out.println("Slots are not available!!");
					break;
				}
				System.out.println("Enter the vehicle name :");
				String name = sc.next();
				System.out.println("Enter the vehicle id :");
				int id = sc.nextInt();
				Vehicle v;
				if (name.equalsIgnoreCase("car"))
					v = new Car(id);
				else if (name.equalsIgnoreCase("Bike"))
					v = new Bike(id);
				else
					v = new Truck(id);
				pa.parkVehicle(v);
				break;
			}
			case 2: {
				System.out.println("Enter the vehicle name :");
				String name = sc.next();
				System.out.println("Enter the vehicle id :");
				int id = sc.nextInt();
				Vehicle v;
				if (name.equalsIgnoreCase("car"))
					v = new Car(id);
				else if (name.equalsIgnoreCase("Bike"))
					v = new Bike(id);
				else
					v = new Truck(id);
				pa.removeVehicle(v);
				break;
			}
			case 3: {
				System.out.println("Total revenue generated : $" + pa.total_amount);
				break;
			}
			case 4: {
				System.out.println(pa);
				break;
			}
			case 5:
				return;
			}

		}
	}
}
