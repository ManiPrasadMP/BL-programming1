package objectOriented.employee_management;

import java.util.Scanner;

public class MainEmployeeTest {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Suresh", Designation.JUNIOR, 25000);
        employees[1] = new Employee(102, "Prasad", Designation.MID, 30000);
        employees[2] = new Employee(103, "Ravi", Designation.SENIOR, 40000);
        employees[3] = new Employee(104, "John", Designation.LEAD, 55000);
        employees[4] = new Employee(105, "Kiran", Designation.JUNIOR, 26000);

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View All Employees");
            System.out.println("2. Promote an Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Employee List ---");
                    for (Employee emp : employees) {
                        emp.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Employee ID to promote: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.getId() == id) {
                            emp.promote();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1 to 3.");
            }

        } while (true);
    }
}
