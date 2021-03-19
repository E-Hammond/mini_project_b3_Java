package classes;

import interfaces.ICustomer;

import java.util.ArrayList;

public class Customer implements ICustomer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double transaction) {
        transaction = transaction < 0 ? 0 : transaction;
        if (!(name.equals(""))) {
            this.name = name;
            this.transactions = new ArrayList<>();
            this.transactions.add(transaction);
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override
    public void addTransaction(double transaction) {
        if (transaction == 0 & transaction >0) {
            transactions.add(transaction);
        }
    }
}