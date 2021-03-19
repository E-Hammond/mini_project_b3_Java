package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankTest {
private Bank bank;

    @Before
    public void setUp() throws Exception {
        bank = new Bank("Ghana Commercial Bank");
        bank.addBranch("Accra");
        bank.addCustomer("Accra", "Doe", 50.05);
        bank.addCustomerTransaction("Accra", "Doe", 44.22);
        bank.listCustomers("Accra", true);
    }

    @Test
    public void addBranch() {
        assertTrue(bank.addBranch("Cape coast"));
        assertFalse(bank.addBranch("Accra"));
    }

    @Test
    public void addCustomer() {
        assertTrue(bank.addCustomer("Accra", "Emma", 300.00));
        assertFalse(bank.addCustomer("Accra", "Doe", 50.05));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(bank.addCustomerTransaction("Accra", "Doe", 500.00));
        assertFalse(bank.addCustomerTransaction("Colorado", "Manuel", 50.05));
    }

    @Test
    public void listCustomers() {
        assertTrue(bank.listCustomers("Accra", true));
        assertFalse(bank.listCustomers("Cape Coast", false ));
    }
}