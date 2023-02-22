import java.util.*;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1234, 30000);
        account.setAnnualInterestRate(3.5);
        account.withdraw(2000.0);
        account.deposit(4000.0);
        System.out.println("bal: $" + account.getbal());
        System.out.printf("Monthly Interest: " + "$%.2f",account.getMonthlyInterest());
    }
}

class Account {
    private int id = 0;
    private double bal = 0;
    private static double annualInterestRate = 0;

    public Account(int id, double bal) {
        this.id = id;
        this.bal = bal;
    }

    public int getId() {
        return this.id;
    }

    public double getbal() {
        return this.bal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setbal(double bal) {
        this.bal = bal;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return bal * getMonthlyInterestRate();
    }

    public void deposit(double amount) {
        this.bal += amount;
    }
    
    public void withdraw(double amount) {
        this.bal -= amount;
    }

}