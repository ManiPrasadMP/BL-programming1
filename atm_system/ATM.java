package objectOriented.atm_system;

class ATM {
    private UserAccount[] users;
    private int[] failedAttempts;

    public ATM(UserAccount[] users) {
        this.users = users;
        this.failedAttempts = new int[users.length];
    }

    public UserAccount login(int accNo, int enteredPin) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAccountNumber() == accNo) {
                if (failedAttempts[i] >= 3) {
                    System.out.println("Account locked due to 3 failed attempts.");
                    return null;
                }
                if (users[i].validatePin(enteredPin)) {
                    failedAttempts[i] = 0; // reset on success
                    System.out.println("Login successful.");
                    return users[i];
                } else {
                    failedAttempts[i]++;
                    int remaining = 3 - failedAttempts[i];
                    System.out.println("Incorrect PIN. Attempt " + failedAttempts[i] + "/3");
                    if (remaining > 0) {
                        System.out.println("You have " + remaining + " attempt(s) left.");
                    } else {
                        System.out.println("Account locked due to too many failed attempts.");
                    }
                    return null;
                }
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}

