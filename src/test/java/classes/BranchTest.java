package classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BranchTest {
    Branch branch;

    @Before
    public void setUp() throws Exception {
        branch = new Branch("Kumasi");
        branch.newCustomer("Holla", 400.00);
    }

    @Test
    public void getName() {
        assertEquals("Texas", branch.getName());
        assertNotEquals("Accra", branch.getName());
    }


    @Test
    public void getCustomers() {
        assertEquals("Holla", branch.getCustomers().get(0).getName());
        assertNotEquals("Robert", branch.getCustomers().get(0));
    }


    @Test
    public void newCustomer() {
        assertTrue(branch.newCustomer("Bismark", 300.00));
    }

    @Test
    public void addCustomerTransaction() {
        assertTrue(branch.addCustomerTransaction("Holla",400.00));
        assertFalse(branch.addCustomerTransaction("Simon",700.00));
    }
}