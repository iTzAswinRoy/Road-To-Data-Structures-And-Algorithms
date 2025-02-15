package com.BankApplication.Bank;

import com.BankApplication.Bank.Account.AccountClass;

import java.util.HashMap;
import java.util.Map;

public class BankClass {
    public Map<Integer, CustomerClass> customers_Bank_Class_Instance_Variable;
    public Map<Integer, AccountClass> accounts_Bank_Class_Instance_Variable;

    public BankClass() {
        customers_Bank_Class_Instance_Variable = new HashMap<>();
        accounts_Bank_Class_Instance_Variable = new HashMap<>();
    }

    public void createCustomer(String name, AccountClass account) {
        int customerId = customers_Bank_Class_Instance_Variable.size() + 1;
        CustomerClass customer = new CustomerClass(customerId, name, account);

        customers_Bank_Class_Instance_Variable.put(customerId, customer);
        accounts_Bank_Class_Instance_Variable.put(account.getAccountNumber(), account);

        System.out.println("Customer created: " + name + " with account number: " + account.getAccountNumber());
    }

    public void transferMoney(int fromAccount, int toAccount, double amount) {
        AccountClass from = accounts_Bank_Class_Instance_Variable.get(fromAccount);
        AccountClass to = accounts_Bank_Class_Instance_Variable.get(toAccount);

        System.out.println(from);
        System.out.println(to);

        if (from != null && to != null) {
            if (from.getBalance() >= amount) {

                from.withdraw(amount);
                to.deposit(amount);
                System.out.println("Transferred " + amount + " from account " + fromAccount + " to account " + toAccount);
            } else {
                System.out.println("Insufficient funds in account " + fromAccount);
            }
        } else {
            System.out.println("One or both account numbers are invalid.");
        }
    }

    public void viewTransactionHistory(int accountNumber) {
        AccountClass account = accounts_Bank_Class_Instance_Variable.get(accountNumber);

        if (account != null) {
            // Assuming we had a list of transactions in the Account class
            System.out.println("Transaction history for account " + accountNumber + ": (Not yet implemented)");

        } else {
            System.out.println("Account number " + accountNumber + " not found.");
        }
    }

    public static void main(String[] args) {
        BankClass o = new BankClass();

        o.transferMoney(1,2, 20);

    }
}

