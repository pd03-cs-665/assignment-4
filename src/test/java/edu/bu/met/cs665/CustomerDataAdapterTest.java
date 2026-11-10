package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.legacy.LegacySystem;
import edu.bu.met.cs665.modern.CustomerDataAdapter;

public class CustomerDataAdapterTest {
    public LegacySystem legacySystem;
    public CustomerDataAdapter adapter;

    @Before
    public void setUp() {
        legacySystem = new LegacySystem();
        adapter = new CustomerDataAdapter(legacySystem);
    }

    @Test
    public void testLegacySystemPrint() {
        assertEquals(0, legacySystem.getPrintCallCount());
        legacySystem.printCustomer(1);
        assertEquals(1, legacySystem.getPrintCallCount());
    }

    @Test
    public void testGetCustomerViaHttps() {
        Customer customer = adapter.getCustomerViaHttps(1);
        assertNotNull(customer);
        assertEquals(1, customer.getCustomerId());
    }

    @Test
    public void testPrintCustomerAdaptToUsb() {
        assertEquals(0, legacySystem.getPrintCallCount());
        adapter.printCustomer(1);
        assertEquals(1, legacySystem.getPrintCallCount());
    }
}
