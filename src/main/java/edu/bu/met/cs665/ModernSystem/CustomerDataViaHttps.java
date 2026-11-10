package edu.bu.met.cs665.ModernSystem;

import edu.bu.met.cs665.Customer;

public interface CustomerDataViaHttps {
    void printCustomer(int customerId);
    Customer getCustomerViaHttps(int customerId);
}
