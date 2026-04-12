class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Arun", 5000);
        acc.deposit(1000);
        acc.withdraw(2000);
        System.out.println("Balance: " + acc.getBalance());
    }
}