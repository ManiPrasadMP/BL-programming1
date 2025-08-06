package objectOriented.banking;
import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("=== Welcome to the Bank System ===");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Create Account (without deposit)");
            System.out.println("2. Create Account (with deposit)");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter owner name: ");
                    sc.nextLine(); 
                    String name1 = sc.nextLine();
                    boolean created1 = bank.createAccount(name1);
                    if (created1)
                        System.out.println("Account created for " + name1);
                    break;

                case 2:
                    System.out.print("Enter owner name: ");
                    sc.nextLine();
                    String name2 = sc.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double init = sc.nextDouble();
                    boolean created2 = bank.createAccount(name2, init);
                    if (created2)
                        System.out.println("Account created for " + name2);
                    break;

                case 3:
                    System.out.print("Enter account number to deposit into: ");
                    int depAcc = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depAmt = sc.nextDouble();
                    Account depAccount = bank.findAccount(depAcc);
                    if (depAccount != null) {
                        depAccount.deposit(depAmt);
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    int witAcc = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double witAmt = sc.nextDouble();
                    Account witAccount = bank.findAccount(witAcc);
                    if (witAccount != null) {
                        boolean success = witAccount.withdraw(witAmt);
                        System.out.println("Withdraw success? " + success);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter source account number: ");
                    int src = sc.nextInt();
                    System.out.print("Enter target account number: ");
                    int tgt = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double amt = sc.nextDouble();
                    Account srcAcc = bank.findAccount(src);
                    Account tgtAcc = bank.findAccount(tgt);
                    if (srcAcc != null && tgtAcc != null) {
                        boolean success = srcAcc.transfer(tgtAcc, amt);
                        System.out.println("Transfer success? " + success);
                    } else {
                        System.out.println("One or both accounts not found.");
                    }
                    break;

                case 6:
                    bank.showAllAccounts();
                    break;

                case 7:
                    System.out.println("Thank you for using the Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
