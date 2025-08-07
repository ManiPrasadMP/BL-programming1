package objectOriented.food_menu;

import java.util.Scanner;

public class Restaurant {
    private static final int MAX_ORDERS = 10;
    private static FoodItem[] orders = new FoodItem[MAX_ORDERS];
    private static int orderCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Welcome Taj");

        do {
            System.out.println("1. Order Pizza");
            System.out.println("2. Order Burger");
            System.out.println("3. Order Pasta");
            System.out.println("4. Show All Orders");
            System.out.println("5. Show Bill Summary");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addOrder(new Pizza());
                    break;
                case 2:
                    addOrder(new Burger());
                    break;
                case 3:
                    addOrder(new Pasta());
                    break;
                case 4:
                    showAllOrders();
                    break;
                case 5:
                    showBillSummary();
                    break;
                case 6:
                    System.out.println("Thank you! Visit again.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }

    private static void addOrder(FoodItem item) {
        if (orderCount < MAX_ORDERS) {
            orders[orderCount++] = item;
            item.prepare();
            System.out.println("Order placed successfully.");
        } else {
            System.out.println("Cannot take more orders.");
        }
    }

    private static void showAllOrders() {
        if (orderCount == 0) {
            System.out.println("No orders placed yet.");
            return;
        }
        for (int i = 0; i < orderCount; i++) {
            System.out.println("Order " + (i + 1) + ":");
            orders[i].display();
        }
    }

    private static void showBillSummary() {
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            total += orders[i].getPrice();
        }
        System.out.println("Total Items: " + orderCount);
        System.out.println("Total Bill: Rs." + total);
    }
}
