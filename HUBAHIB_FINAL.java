
public class Hubahib_final {

    private String accountHolderName;
    private long accountNumber;
    private double balance;
    private float interestRate;
    private int age;

    // Constructor should match the class name
    public Hubahib_final(String accountHolderName, long accountNumber, double initialDeposit, float interestRate, int age) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        this.interestRate = interestRate;
        this.age = age;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    public double calculateAnnualInterest() {
        return balance * (interestRate / 100);
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Account Holder's Age: " + age);
    }

    public static void main(String[] args) {
        
        Hubahib_final account = new Hubahib_final("Brian Hubahib", 1234567890L, 5000.0, 3.5f, 19);

        System.out.println("Initial Account Details:");
        account.displayAccountDetails();

        account.deposit(2000.0);
        account.withdraw(1500.0);
        double annualInterest = account.calculateAnnualInterest();

        System.out.println("\nFinal Account Details:");
        account.displayAccountDetails();
        System.out.println("Annual Interest Earned: " + annualInterest);
    }
}
