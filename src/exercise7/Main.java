package exercise7;

public class Main {
    public static void main(String[] args) {
        Account my = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        my.withdraw(2_500);
        my.deposit(3_000);
        System.out.println("Balance: " + my.getBalance());
        System.out.println("Monthly interest rate: " + Account.getMonthlyInterestRate());
        System.out.println("Date: " + my.getDateCreated().toString());
    }
}
