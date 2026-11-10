package edu.bu.met.cs665.LegacySystem;

import edu.bu.met.cs665.Customer;

public interface CustomerDataViaUsb {
    void printCustomer(int customerId);
    Customer getCustomerViaUsb(int customerId);
}
