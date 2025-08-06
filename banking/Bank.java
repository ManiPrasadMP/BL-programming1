package objectOriented.banking;

class Bank {
    private Account[] accounts = new Account[10];
    private int count = 0;

    public boolean createAccount(String name) {
        if (count >= 10) {
            System.out.println("Bank full. Cannot create more accounts.");
            return false;
        }
        accounts[count++] = new Account(name);
        return true;
    }

    public boolean createAccount(String name, double initialDeposit) {
        if (count >= 10) {
            System.out.println("Bank full. Cannot create more accounts.");
            return false;
        }
        accounts[count++] = new Account(name, initialDeposit);
        return true;
    }

    public Account findAccount(int accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accNo)
                return accounts[i];
        }
        return null;
    }

    public void showAllAccounts() {
        System.out.println("Bank Accounts:");
        for (int i = 0; i < count; i++) {
            accounts[i].display();
        }
    }
}
