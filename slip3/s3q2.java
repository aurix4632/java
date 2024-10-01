class Account {
    int accno;
    String accname;
    double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public static void sortAccount(Account[] accounts) {
        for (int i = 0; i < accounts.length - 1; i++) {
            for (int j = 0; j < accounts.length - i - 1; j++) {
                if (accounts[j].balance > accounts[j + 1].balance) {
                    // Swap accounts[j] and accounts[j+1]
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.println("Account Number: " + accno);
        System.out.println("Account Name: " + accname);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class s3q2 {
    public static void main(String[] args) {
        // Create an array of Account objects
        Account[] accounts = new Account[5];
        accounts[0] = new Account(101, "John Doe", 1500);
        accounts[1] = new Account(102, "Jane Doe", 2000);
        accounts[2] = new Account(103, "Bob Smith", 1200);
        accounts[3] = new Account(104, "Alice Johnson", 1800);
        accounts[4] = new Account(105, "Eve Johnson", 1000);

        // Sort the accounts based on balance
        Account.sortAccount(accounts);

        // Display account details in sorted order
        System.out.println("Account Details (Sorted by Balance):");
        for (Account account : accounts) {
            account.display();
        }
    }
}

