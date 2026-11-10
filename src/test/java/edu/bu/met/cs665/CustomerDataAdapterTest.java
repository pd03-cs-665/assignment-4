package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.bu.met.cs665.LegacySystem.LegacySystem;
import edu.bu.met.cs665.ModernSystem.CustomerDataAdapter;

public class CustomerDataAdapterTest {
    public LegacySystem legacySystem = new LegacySystem();
    public CustomerDataAdapter adapter = new CustomerDataAdapter(legacySystem);

    @Test
    void testGetCustomerViaHttps() {
        Customer customer = adapter.getCustomerViaHttps(1);
        assertNotNull(customer);
        assertEquals(1, customer.getCustomerId());
        
    }
}
