package objectOriented.atm_system;

import java.util.Scanner;

public class TestATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		UserAccount[] accounts = new UserAccount[5];
		accounts[0] = new UserAccount(101, 1111, 5000);
		accounts[1] = new UserAccount(102, 2222, 6000);
		accounts[2] = new UserAccount(103, 3333, 7000);
		accounts[3] = new UserAccount(104, 4444, 8000);
		accounts[4] = new UserAccount(105, 5555, 9000);

		ATM atm = new ATM(accounts);

		System.out.println("==== Welcome to MY ATM ====");
		do {
			System.out.println("\n--- Main Menu ---");
			System.out.println("1. Login");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Account Number: ");
				int accNo = sc.nextInt();

				System.out.print("Enter PIN: ");
				int pin = sc.nextInt();

				UserAccount user = atm.login(accNo, pin);

				if (user != null) {
					do {
						System.out.println("\n--- ATM Menu ---");
						System.out.println("1. Check Balance");
						System.out.println("2. Deposit");
						System.out.println("3. Withdraw");
						System.out.println("4. Exit");
						System.out.print("Enter your choice: ");
						choice = sc.nextInt();

						switch (choice) {
						case 1:
							user.displayBalance();
							break;
						case 2:
							System.out.print("Enter amount to deposit: ");
							double dep = sc.nextDouble();
							user.deposit(dep);
							System.out.println("Deposit successful.");
							break;
						case 3:
							System.out.print("Enter amount to withdraw: ");
							double amt = sc.nextDouble();
							if (user.withdraw(amt)) {
								System.out.println("Withdrawal successful.");
							} else {
								System.out.println("Insufficient balance.");
							}
							break;
						case 4:
							System.out.println("Thank you! Logging out...");
							break;
						default:
							System.out.println("Invalid option.");
						}

					} while (choice != 4);
				}
				break;
			case 2:
				System.out.println("Thank you for using the ATM. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Please enter 1 or 2.");
			}

		} while (true);
	}
}
