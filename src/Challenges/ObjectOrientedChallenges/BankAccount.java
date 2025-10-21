package Challenges.ObjectOrientedChallenges;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private String accountNumber;
    private double balance;
    private String pin;
    private List<String> transactionHistory;

    public BankAccount(String accountNumber, double initialBalance, String pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Compte créé avec solde initial : " + initialBalance + " €");
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Montant du dépôt invalide.");
            return;
        }
        balance += amount;
        System.out.println(amount + " € déposés.");
        transactionHistory.add("Dépôt : +" + amount + " €");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Montant du retrait invalide.");
            return;
        }
        if (amount > balance) {
            System.out.println("Fonds insuffisants : vous avez " + balance + " € disponible.");
        } else {
            balance -= amount;
            System.out.println(amount + " € retirés.");
            transactionHistory.add("Retrait : -" + amount + " €");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayTransactionHistory() {
        System.out.println("Historique des transactions :");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
