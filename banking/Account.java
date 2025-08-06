package objectOriented.banking;

class Account {
    private static int nextAccountNumber = 1001;

    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(String ownerName) {
        this(ownerName, 0);
    }

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.accountNumber = nextAccountNumber++;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false; // overdraft protection
    }

    public boolean transfer(Account target, double amount) {
        if (this.withdraw(amount)) {
            return target.deposit(amount);
        }
        return false;
    }

    public void display() {
        System.out.println("Account No: " + accountNumber +
                ", Owner: " + ownerName +
                ", Balance: Rs." + balance);
    }
}

