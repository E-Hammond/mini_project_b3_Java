package interfaces;

import classes.Customer;

import java.util.ArrayList;

public interface IBranch {

    String getName();
    ArrayList<Customer> getCustomers();
    boolean newCustomer( String name, double transaction);
    boolean addCustomerTransaction(String name,double transaction);
}
