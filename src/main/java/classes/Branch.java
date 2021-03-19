package classes;

import interfaces.IBranch;

import java.util.ArrayList;

public class Branch implements IBranch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch (String name) {
        name = name;
        customers = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public ArrayList<Customer> getCustomers() {
        return customers;
    }


    @Override
    public boolean newCustomer( String name, double transaction){
        if(findCustomer(name)==null & !(name.equals("")) & transaction>=0){
            Customer customer = new Customer(name, transaction);
            this.customers.add(customer);
            return true;
        }
        else return false;
    }

    @Override
    public boolean addCustomerTransaction(String name, double transaction) {

        if((!(findCustomer(name) == null)) & transaction > 0){
            findCustomer(name).addTransaction(transaction);
            return true;
        }
        else return false;
    }

    private Customer findCustomer(String name){

        for(Customer customer: customers){
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
}

